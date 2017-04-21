package pp                          //creating package pp
class FunDemo{
    def execute(sayHello:(String)=>Unit,name:String){       //function having argument as function(String) and String
        sayHello(name)                                      //which calls our hello(String) method because we pass hello() as argemunt to execute() method
    }

                                     // a method that takes a function and a string, and passes the string into
                                    // the function, and then executes the function
}
object FunProgrammingUsingClosure extends App{

    var h:String="hello"
    def hello(name:String){                     //hello method 
        println(s"$h,$name")            
    }  

    var v=new pp.FunDemo                //creats object of pp.FunDemo class 

    v.execute(hello,"DDA")                   // execute hello() from the execute() method 
    h="hii"
    v.execute(hello,"DA") 

}