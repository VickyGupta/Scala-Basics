object FunctionWithArgsReturnType{
	
	def asd(a:Int,b:Int): Int ={		//defining function with 2 Int argument with return type as Int

		val c=a+b;;
		//c=a+b;
		return c;			//returning value
		//println(c);			//here not neccessory to use return keyword.
	
	}

	def main(args:Array[String]){
		println(asd(10,20));		//calling method
	}

}