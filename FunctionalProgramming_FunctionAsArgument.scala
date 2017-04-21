
object FunctionalProgramming_FunctionAsArgument extends App {

    def mul(i:Int)={
           i%2==0 
    }


/**
* These methods can be passed into collection methods that expect a function that
* has one Int parameter and returns a Boolean 
*/

   var l=List.range(1,10)   //creating list having renge betn 1 to 9

    println(l.filter(mul))      //calling filter method of collection class passing mul method as argument without argument
}