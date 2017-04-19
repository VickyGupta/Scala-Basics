class DemoSuper{
 println("Demo Super");
}

class DemoSub extends DemoSuper{
    println("Demo Sub");
}

object ObjectCastingDemo{

    def main(args:Array[String]){
    var dsuper = new DemoSuper
    var dsub = new DemoSub

    var v = dsub.asInstanceOf[DemoSuper]     //used for casting one oject type to another....((Q).but here it will not reflect the change)
     println(v)
    println(v.isInstanceOf[DemoSub])       //isInstanceOf method used for checking type of object
    println(v.isInstanceOf[DemoSuper])


    println(dsuper.getClass)
    println(dsub.getClass)              //getClass method returns the class represented by perticular object
   
    
    var a:Int=10;
    var b=a.asInstanceOf[Long]
    println(b.getClass);
   println(v.getClass);
    

    // var v1=dsuper.asInstanceOf[DemoSub];     //class cast exception..super class cannot cast to subclass 

    //println(v1.isInstanceOf[DemoSuper]);
    //println(v1.isInstanceOf[DemoSub]);

    }
}