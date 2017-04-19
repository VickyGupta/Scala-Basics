object ClosuresDemo{			//closures are just like functions in scala the only difference is that closure is depend on value outsid ethe function
    def main(args:Array[String]){
   println( add(5));
    }

val num=10;

var add=(a:Int) => num+a		//defining the function which take Int argumet and return the addition of the num varible and passed argument

}