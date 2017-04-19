object DemoFor {
   def main(args: Array[String]) {
      var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);		//creating List of Integer

							 // for loop execution with multiple filters

      for( a <- numList  if a != 3 ; if a < 8 ){	//we can print  elements from List and we use conditions to filter out the records
         println( "Value of a: " + a );
      }

    var i:Int=0;
      for(i <- 1 to 10){				//printing values from 1 to 10.
							//there are two ways to use for using to and until keywords
        println(i);					//to-->it will print upto last element
      }							//until-->it will print upto last-1 element
   }
}