package pack1{                    //creating package in scala,but we can use java approach without curly braces              
  class Demo{
    override def toString="In Pack1.Demo class"
  }
}

package pack2{
  class Demo{
    override def toString="In Pack2.Demo class"
  }
}

object PackageDemo extends App{
    println(new pack1.Demo);
    println(new pack2.Demo);                //printing the object of demo classes from perticular packages
                                             //which calls toString method and returns the String output       
}