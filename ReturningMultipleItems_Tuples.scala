class methodDemo{

    def method(a:Int,b:String)={
        (a*10,"hello:"+b)
    }
}
object ReturningMultipleItems_Tuples{

    def main(args:Array[String]){
        println("Main Method");
        var v=new methodDemo
        val (no,greating)=v.method(10,"DDA");     //returning tuple..containg multiple values
        println(no);
        println(greating);      //accessing values from tuple

//anotere way to access tuple items

        val res=v.method(1,"D");
        println(res);
        println(res._1);
        println(res._2);

    }

}