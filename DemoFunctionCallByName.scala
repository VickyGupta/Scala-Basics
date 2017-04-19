object DemoFunctionCallByName {
   def main(args: Array[String]) {
        delayed(time());	       //call to functiion which contain argument as function	
   }

  
   def delayed( t: => Long ) {	      //functiion which contain argument as function  as object(Type) as Long
      println("In delayed method")
      println("Param: " + t)
   }

    def time() = {		    //function which returns time as Long to caller function
      println("Getting time in nano seconds")
      System.nanoTime
   }
}