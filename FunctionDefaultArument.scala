object FunctionDefaultArument{

    def main(args:Array[String]){
        println("Default Argument Function");

       var i= add();
       println(i);
    }

    def add(a:Int=5,b:Int=10):Int={	//in call if we dont specify any argument then also scala allows to pass default argument to function which contain exact value
        var c=a+b;
        return c;
    }

}