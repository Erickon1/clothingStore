package mx.erick

import grails.gorm.transactions.Transactional
import grails.web.databinding.DataBinder

@Transactional
class ShortService implements DataBinder{

    Short get(Serializable id){
      Short.get(id)
    }

    List<Short> list(Map args){
      Short.findAll(args)
    }

    Long count(){
      Short.count()
    }

    void delete(Serializable id){
      Short.delete(id)
    }

    Short save(Short shortt, Integer total = 0){
      def tempItem
      total.times{
        tempItem = new Short()
        bindData(tempItem, shortt)
        tempItem.save()
      }
      tempItem = total==0 ? shortt.save() : tempItem
    }

}
