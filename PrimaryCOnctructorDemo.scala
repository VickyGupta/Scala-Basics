class PrimaryCOnctructor(var name:String,var age:Int){      //name and age are mutator fields of class and which acts as arguments of constructor also
                                                            //if we declare the field as var or val then 
    println("constructor Begins:");                         //var---scala provide default getter annd setter methods
                                                            //val--scala provide only default getter methods not setter because val objects are immutable
                                                            //not var and not val....it will not provide getter annd setter methods
                                                           // p.name_$eq("Metta World Peace")...hidden default setter method of scala


                                                           


    private var home=System.getProperty("user.home");       //private var access within same class
                            //this method is used for getting environment varible whose name is home

     def getName{     
        println(s"Name:$name");    //method which prints the name on console 
     } 

     def getAge{
        println(s"Age:$age");      //method which prints the age on console 
     } 

     def getHome{
        println(s"Home:$home");    ////method which prints the home env variable on console 
     }        

     override def toString={            //this method call when we try to print current object of class  
      s"$name is $age years old."       //and if we not override toString method in our class then it will call toString method of Object class
    }                                       //which will return hashcode of our object

     def getData{
        println(this);                  //it will calls the toString method in our class,if it is not found then it will calls from object class
     }      


     getName                //calling to the getter methods of our class
     getAge
     getHome  
     getData


     println("Still in Constuctor");
    
}

object PrimaryCOnctructorDemo{      //creating singleton class(user class)
    def main(args:Array[String]){
        var p=new PrimaryCOnctructor("DDA",22); //creating object of PrimaryCOnctructor class and invoking implicit constuctor.

        p.name="ADD";   
        p.getName
                        //name and age are mutator fields so we can (re-assign)change value of it.
        p.age=30;
        p.getAge

    }

}