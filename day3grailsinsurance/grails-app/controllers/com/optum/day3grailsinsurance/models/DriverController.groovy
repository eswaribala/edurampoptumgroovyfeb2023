package com.optum.day3grailsinsurance.models

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class DriverController {

    DriverService driverService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond driverService.list(params), model:[driverCount: driverService.count()]
    }

    def show(Long id) {
        respond driverService.get(id)
    }

    def create() {
        respond new Driver(params)
    }

    def save(Driver driver) {
        if (driver == null) {
            notFound()
            return
        }

        try {
            driverService.save(driver)
        } catch (ValidationException e) {
            respond driver.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'driver.label', default: 'Driver'), driver.id])
                redirect driver
            }
            '*' { respond driver, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond driverService.get(id)
    }

    def update(Driver driver) {
        if (driver == null) {
            notFound()
            return
        }

        try {
            driverService.save(driver)
        } catch (ValidationException e) {
            respond driver.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'driver.label', default: 'Driver'), driver.id])
                redirect driver
            }
            '*'{ respond driver, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        driverService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'driver.label', default: 'Driver'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'driver.label', default: 'Driver'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
