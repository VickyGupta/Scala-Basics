class FuctionScopeSuper{

    def demo(d:FuctionScopeSuper){                 //public method ...accessible from anywhere
        println("Public demo method")
        //d.demo3        //...error: value demo3 is not a member of FuctionScopeSuper...demo3 is object private method
        d.demo1
    }

    protected def demo1{                //protectd method ...accessible from subclass
         println("Procted demo1 method")  
         this.demo3                     //calling to object private method which must be called from current instance of the current object
    }

    private[this] def demo3{               //object private method...When you do this, the method is available only to the 
                                           //     current instance of the current object 
        println("object Private demo3 method")
    }


//demo(new FuctionScopeSuper)
}

class FuctionScopeSub extends FuctionScopeSuper{
    
   demo1            //calling to protected method which is available in subclass
    def demo2(d1:FuctionScopeSuper){
     println("public demo2 method")
     //d1.demo1
    }
}

object DemoFuctionScope{

    def main(args:Array[String]){
        println("In main Method");

        var a=new FuctionScopeSuper
        a.demo(new FuctionScopeSuper)

        var b=new FuctionScopeSub
        b.demo2(new FuctionScopeSuper);
    }

}