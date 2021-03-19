package mx.erick

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_USER')
class StockController {

    static allowedMethods = [save: "POST", update: "PUT"]

    def create() {
    }

    def save(){
      println "estamos en save"
      println params
      respond [:], view:'create'
      return
    }

}
