object FactorialRecursiveFunction{

    def main(args:Array[String]){

       val a=fact(5);
       println(a);

    }

   def  fact(f:Int):Int={    //fact is recursive function
  
        if(f==1)
        {       
         return 1;
       
        }
        else
          f*fact(f-1);	   //recursive function calls itself

   }

}