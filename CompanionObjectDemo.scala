class CompanionObjectDemo{

   def demoMethod(a:Int){
        println("value of a:"+a);
   }

}

object  CompanionObjectDemo {         //it is a copmanion object.A companion object is simply an object that’s defined in the same file
                                    //as a class , where the object and class have the same name.
                                    //method declared in a companion object will appear to be a static method on the object

    def main(args:Array[String]){

            CompanionObjectDemo.demo       //calling method declared in companion object using class name itself.
                                            //this is exactly equal to static method in java



            val a1=new CompanionObjectDemo();
            a1.demoMethod(10);              
    
    }

    def demo{
        println("Demo Method");         //method declared in CompanionObjectDemo object, so it will treat as like static method in java
    }

  }                                  