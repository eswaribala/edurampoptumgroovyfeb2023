package com.optum.day3grailsinsurance.models

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PolicyHolderController {

    PolicyHolderService policyHolderService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond policyHolderService.list(params), model:[policyHolderCount: policyHolderService.count()]
    }

    def show(Long id) {
        respond policyHolderService.get(id)
    }

    def create() {
        respond new PolicyHolder(params)
    }

    def save(PolicyHolder policyHolder) {
        if (policyHolder == null) {
            notFound()
            return
        }

        try {
            policyHolderService.save(policyHolder)
        } catch (ValidationException e) {
            respond policyHolder.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'policyHolder.label', default: 'PolicyHolder'), policyHolder.id])
                redirect policyHolder
            }
            '*' { respond policyHolder, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond policyHolderService.get(id)
    }

    def update(PolicyHolder policyHolder) {
        if (policyHolder == null) {
            notFound()
            return
        }

        try {
            policyHolderService.save(policyHolder)
        } catch (ValidationException e) {
            respond policyHolder.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'policyHolder.label', default: 'PolicyHolder'), policyHolder.id])
                redirect policyHolder
            }
            '*'{ respond policyHolder, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        policyHolderService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'policyHolder.label', default: 'PolicyHolder'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'policyHolder.label', default: 'PolicyHolder'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
