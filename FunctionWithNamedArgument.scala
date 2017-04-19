object FunctionWithNamedArgument{

    def main(argd:Array[String]){

        println("In main Method:");

        printDetails(b=10,a=5);		//when calling a function if we specify default values to the argument 
					//and we use same same varibles in defn of function also then default values will assign to that perticular named function itself.
    }

   def printDetails(a:Int,b:Int){		
    
        println(a);
        println(b);
   
   }
    
}