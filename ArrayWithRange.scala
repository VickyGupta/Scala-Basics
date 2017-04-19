import Array._			//importing Array package ...here '_' (underscore)used for importing all classes from perticular package 

object ArrayWithRange{
    def main(args:Array[String]){

        var a=range(10,30,3);	//creating Array with range keyword...here first 2 arguments are start and end elements of array and
				//third one is range(Diff betn two elements)

        a.foreach{
            println
        }

println("......................");

        var b=range(10,20);

        b.foreach{
            println
        }
    }
}