package mx.erick

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER','ROLE_ADMIN'])
class StockController {

    def index(Integer max) {
    }

}
