object FunctionCallByName{

    def main(args:Array[String]){
        demo(time());       //Function calling another fun...-->Call by name
    }

         def demo( t: => Long ){    //Every fun in scala is instance of class.
                                    // => this modifier create instance of function.
                                    // t: => Long ..Function that takes an argument of as type i.e. insatnce of function as  Long       
        println("In Demo Method:");
        println("Time:"+t)
        }

        def time():Long={
        println("In time Method");
        System.nanoTime();
        }
   

}


