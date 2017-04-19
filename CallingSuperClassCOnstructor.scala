class superdemo(var name:String,var id:Int){    

   println("two-arg constructor primary constructor of superclass");
   println(id+"..."+name);

    def this( name:String){
    this("Maharashtra",12);                     //calling same class string and Int param constructor
    println("no-arg constructor Auxillary constructor");
    println("Addr:"+name)

    }
}

class subDemo(name:String) extends superdemo(name){     //calling super class string param constructor when we create object of subclass using 
                                                         //string param constructor   

   def this(){                                          
    this("Add");                                         //calling same class string param constructor
   println("no-arg constructor Auxillary constructor");
    
   }
    //super("sss")
    println("one-arg constructor primary constructor of subclass");
   // this();

}


object CallingSuperClassCOnstructor{

    def main(args:Array[String]){

        var sub=new subDemo("DDA");             //creating oject of subclass using string param constructor....which invokes superclass string param constructor 
        println("object initialised");

    }


}