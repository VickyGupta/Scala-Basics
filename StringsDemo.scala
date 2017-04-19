object StringsDemo{

    def main(args:Array[String]){

        var s1="Hello,";
        var s2:String="Scala";

        println(s1.concat(s2));		//concat two String

        println(s1+s2);			//concat two String

       var ch:Array[Char]=s1.toCharArray();	//it will create Character Array of String

        println("Length of S1:"+s1.length());

        var ch1:Array[String]=s1.split("");


        ch1.foreach{
         println					//it will print every elements of array
        }
        println("==========")
        for (f <- ch) println(f)

        var i1:Array[Byte] =s1.getBytes("UTF-8");	//returns the Array of bytes ..i.e Array for ASCII values for perticular characters

        i1.foreach{
            println
        }
    }

}