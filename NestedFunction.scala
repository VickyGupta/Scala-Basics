object NestedFunction{

    def main(args:Array[String]){

        println(Multiplication(10));
        println(Multiplication(20));
        println(Multiplication(30));

    }

    def Multiplication(a:Int):Int= {

        def mul(a:Int,b:Int):Int={
            val c=a*b;
            c
        }
        mul(a,10);
    }

}