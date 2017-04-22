package society {						//use of package
   package professional {
      class Executive {
         private[professional] var workDetails = null     //access within same package itself
         private[society] var friends = null
         private[this] var secrets = null         //access within same class using same instance variable

         def help(another : Executive) {
            println(another.workDetails)
           // println(another.secrets) //ERROR
         }
      }
   }
}