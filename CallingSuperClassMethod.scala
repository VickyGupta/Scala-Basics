class CallingSuperClassMethod1{
    def demo{
        println("Demo Super");
    }
}

class sub extends CallingSuperClassMethod1{

  override  def demo{
        super.demo;                     //calling super class method from subclass method
        println("Demo Sub");
    }

}

object CallingSuperClassMethod{

    def main(args:Array[String]){
        var v=new sub;
        v.demo
    }
}