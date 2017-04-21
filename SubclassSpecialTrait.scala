trait TraitSuper{

    this:SpecialClass =>
    
    def demo

}

class SpecialClass{

    def sudo:String={
        println("sudo method of Special Class")
        "hello"
    }

}

class NormalClass extends SpecialClass with TraitSuper{

    override def demo{
         println("demo-overridden method of Special Class in Normal class")
    }

    override def sudo:String={
   var v1= super.sudo
        println(s"$v1 ,sudo-overridden method of Special Class in Normal class")
        "hello scala"
    }

}

object SubclassSpecialTrait extends App{

    var v=new NormalClass

    v.demo
   var v2= v.sudo
   println(v2)
}