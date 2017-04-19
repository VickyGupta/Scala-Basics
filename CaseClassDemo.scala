case class CaseClassDemo1(name:String,age:Int){      //creating case class and Case class constructor parameters are val by default
    //this(name);
    println("hello::"+name+"..."+age);
    

    def this(name:String){
    this("DDA",22);
    println("Auxillary Constructor");
    }

}
object CaseClassDemo{               //it is a copmanion object.A companion object is simply an object that’s defined in the same file
                                    //as a class , where the object and class have the same name.

    def main(argd:Array[String]){

       val c1=CaseClassDemo1("DDA",22);      //When you define a class as a case class, you don’t have to use the new keyword to create a new instance
    
    }

}