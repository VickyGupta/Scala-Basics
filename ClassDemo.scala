class ClsDemo(a:Int,b:Int){      
			
					//creating class which having implicit  constructor contaning two Int argument, just like above 
			
	var x=a;
	var y=b;
}

object ClassDemo{			//here we create singleton objet class demo
	
	def main(args:Array[String]){

		var cd=new ClsDemo(10,20);	//creating object of class and storing into a varible

		println(cd.x);println(cd.y)	//printing fields of class using object of class
	}

}