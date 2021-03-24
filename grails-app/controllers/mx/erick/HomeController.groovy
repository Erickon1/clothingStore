package mx.erick

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER','ROLE_ADMIN'])
class HomeController {

    CoatService coatService
    HatService hatService
    ShoesService shoesService
    ShortService shortService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        def coats = coatService.list(params)
        def hats = hatService.list(params)
        def shoess = shoesService.list(params)
        def shorts = shortService.list(params)
        respond coats, model:[
          coatCount: coatService.count(), 
          coats: coats,
          shoess: shoess,
          shorts: shorts,
          hats: hats
        ]
    }

}
