package mx.erick

import grails.gorm.transactions.Transactional
import grails.web.databinding.DataBinder

@Transactional
class CoatService implements DataBinder{

    Coat get(Serializable id){
      Coat.get(id)
    }

    List<Coat> list(Map args){
      Coat.findAll(args)
    }

    Long count(){
      Coat.count()
    }

    void delete(Serializable id){
      Coat.delete(id)
    }

    Coat save(Coat coat, Integer total = 0){
      def tempItem
      total.times{
        tempItem = new Coat()
        bindData(tempItem, coat)
        tempItem.save()
      }
      tempItem = total==0 ? coat.save() : tempItem
    }

}
