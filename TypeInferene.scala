object TypeInference{
	def main(args:Array[String]){

	var a=10;
	val b=20;

	var name="DDA";		//Type Inference...i.e. we are not need to provide type to the variable 
				//the Scala compiler can figure out the type of the variable based on the value assigned to it
	var addr="Banglore";

	println(a+"..."+b+"..."+name+"..."+addr);
	
	}

}