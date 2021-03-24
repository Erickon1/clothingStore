package mx.erick

import grails.gorm.transactions.Transactional
import grails.web.databinding.DataBinder

@Transactional
class HatService implements DataBinder{

    Hat get(Serializable id){
      Hat.get(id)
    }

    List<Hat> list(Map args){
      Hat.findAll(args)
    }

    Long count(){
      Hat.count()
    }

    void delete(Serializable id){
      Hat.delete(id)
    }

    Hat save(Hat hat, Integer total = 0){
      def tempItem
      total.times{
        tempItem = new Hat()
        bindData(tempItem, hat)
        tempItem.save()
      }
      tempItem = total==0 ? hat.save() : tempItem
    }

}
