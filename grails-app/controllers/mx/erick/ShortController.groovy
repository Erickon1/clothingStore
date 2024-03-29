package mx.erick

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_USER')
class ShortController {

    ShortService shortService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond shortService.list(params), model:[shortCount: shortService.count()]
    }

    def show(Long id) {
        respond shortService.get(id)
    }

    def create() {
        respond new Short(params)
    }

    def save(Short shortt) {
        if (shortt == null) {
            notFound()
            return
        }
        shortt.stock = Stock.get(1)
        if (!shortt.validate()) {
          respond shortt.errors, view:'create'
          return
        }

        try {
            shortt = shortService.save(shortt, params.total? params.total as Integer:1 )
        } catch (ValidationException e) {
            respond shortt.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'short.label', default: 'Short'), shortt.id])
                redirect shortt
            }
            '*' { respond shortt, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond shortService.get(id)
    }

    def update(Short shortt) {
        if (shortt == null) {
            notFound()
            return
        }
        if (!shortt.validate()) {
          respond shortt.errors, view:'edit'
          return
        }

        try {
            shortService.save(shortt)
        } catch (ValidationException e) {
            respond shortt.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'short.label', default: 'Short'), shortt.id])
                redirect shortt
            }
            '*'{ respond shortt, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        shortService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'short.label', default: 'Short'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'short.label', default: 'Short'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
