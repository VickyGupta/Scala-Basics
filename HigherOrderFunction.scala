object HigherOrderFunction{

    def main(Args:Array[String]){

        demo(DemoInt());		//higher order fun...i.e.fun calling another fun

    }

    def demo(t: =>Int){			////Every fun in scala is instance of class.
                                    // => this modifier create instance of function.
                                    // t: => Int..Function that takes an argument of as type i.e. insatnce of function as  Int
	
    println("In Demo Function:");
    println("t::"+t);
    }

    def DemoInt():Int={
     println("In DemoInt Function:");
        return 10;
    }
}