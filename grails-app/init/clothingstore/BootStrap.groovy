package clothingstore

import mx.erick.*
import grails.gorm.transactions.Transactional


class BootStrap {

    def init = { servletContext ->
      addTestUser()
    }

    @Transactional
    void addTestUser() {
      5.times{ number-> 
        new Color(name: "color${number}").save()
        new Size(name: "size${number}").save()
      }
      Role role = new Role( authority: "ROLE_USER" ).save()
      User user = new User( username: "eve", password:"11111111" ).save()
      UserRole.create user, role

      UserRole.withSession {
          it.flush()
          it.clear()
      }
    }

    def destroy = {
    }
}
