package clothingstore

import mx.erick.*

class BootStrap {

    def init = { servletContext ->
      
      5.times{ number-> 
        new Color(name: "color${number}").save()
        new Size(name: "size${number}").save()
      }

    }
    def destroy = {
    }
}
