package mx.erick

import grails.gorm.transactions.Transactional
import grails.web.databinding.DataBinder

@Transactional
class ShoesService implements DataBinder{


    Shoes get(Serializable id){
      Shoes.get(id)
    }

    List<Shoes> list(Map args){
      Shoes.findAll(args)
    }

    Long count(){ 
      Shoes.count() 
    }

    void delete(Serializable id){ 
      Shoes.delete(id) 
    }

    Shoes save(Shoes shoes, Integer total = 0){ 
      def tempItem
      total.times{
        tempItem = new Shoes()
        bindData(tempItem, shoes)
        tempItem.save()
      }
      tempItem = total==0 ? shoes.save() : tempItem
    }


}
