package com.optum.day3grailsinsurance.models

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class LossController {

    LossService lossService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond lossService.list(params), model:[lossCount: lossService.count()]
    }

    def show(Long id) {
        respond lossService.get(id)
    }

    def create() {
        respond new Loss(params)
    }

    def save(Loss loss) {
        if (loss == null) {
            notFound()
            return
        }

        try {
            lossService.save(loss)
        } catch (ValidationException e) {
            respond loss.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'loss.label', default: 'Loss'), loss.id])
                redirect loss
            }
            '*' { respond loss, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond lossService.get(id)
    }

    def update(Loss loss) {
        if (loss == null) {
            notFound()
            return
        }

        try {
            lossService.save(loss)
        } catch (ValidationException e) {
            respond loss.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'loss.label', default: 'Loss'), loss.id])
                redirect loss
            }
            '*'{ respond loss, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        lossService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'loss.label', default: 'Loss'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'loss.label', default: 'Loss'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
