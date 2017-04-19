object ArrayDemo{

    def main(args:Array[String]){

        var a=Array(1,2,3,5,4,7,8,6,9);		//creating array and assing to var a.

        for(i <- a){
            println(i);			//it will iterate through whole array and every element		
        }
     println("..............................");
        a.foreach{
            println			//it will iterate through whole array and every element using foreach loop
        }
 println("..............................");
        var max:Int=0;
 
        for(i <- 0 to a.length-1){
           if(a(i)>max)			//finding max element from Array
           max=a(i);
        }

        println(max);
    }

}