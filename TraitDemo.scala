trait Traittrait{		//trait-> which is just similar to Abstract class in java. Which contain functions with defn and without defn

	var a1:Int=0;		//concrete variables no need to write override and var keyword in implementing class
	val b1:Int=10;		//concrete variables must  need to write override keyword in implementing class			//***
	var c1:Int			//Abdtract variable ...need to write override and var keywords in implementation class

	def m1(a:Int,b:Int):Int		//function without defn

	def m2(){
		println("Method m2 in Trait");	//function with defn
	}
	
}

class TraitImpl(xc:Int,yc:Int) extends Traittrait{	//creating class which is inheriting from Trait Traittrait 
							//defining class in scala contains constructor, just like above 
	
	//val x=xc;
	//val y=yc;

	 a1=20;				//***
	override val b1=20
	override var c1=30

	def m1(q:Int,r:Int):Int={		// here we provide implementation to unimplemented function
		val x=xc+q;
		val y=yc+r;

		val z=x+y;			//var-->Mutable object
		return z;			//val-->Immutable object
	}

}

object TraitDemo{				//creating object TraitDemo which is user class(singleTon class) which provide gui to user to call method 
						//in scala singleton class/perticular class represented by keyword object
					
	def main(args:Array[String]){		// main method which is first point of execution
		
		val v1=new TraitImpl(1,2);	//creating object of class and storing in varible v1.

		println(v1.m1(10,20));		//calling method m1()

		v1.m2();			//calling method m2()

	}

}