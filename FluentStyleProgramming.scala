class FluentStyleSuper{
    protected var Fname:String=""
    protected var Lname:String=""                ////A fluent style of programming lets users of your API write code by chaining method calls together   
     def setFname(name:String):this.type={      //it will retrns current reference...which is A fluent style of programming
        this.Fname=name;                        //this class is extended,so we specify this.type as the return type of fluent style methods
        this                                    //If our class is Final i.e.If you’re sure your class won’t be extended, specifying this.type as the return type of
                                                //your set * methods(fluent style methods) isn’t necessary; you can just return the this reference at the end of
                                                //each fluent style method.
     }

      def setLname(name:String):this.type={
        this.Lname=name;
        this
     }
}

class FluentStyleSub extends FluentStyleSuper {

    protected var age:Int=0;

    def setAge(age:Int):this.type={
        this.age=age;
        this
     }

     override def toString={
        s"$Fname,$Lname,$age"
     }

}

object FluentStyleProgramming{

    def main(args:Array[String]){
    val v=new FluentStyleSub
    v.setFname("DDA")                   //A fluent style of programming lets users of your API write code by chaining method calls together
     .setLname("ADD")
     .setAge(10);

     println(v);   
    }
}