class ClassMethodDemo(a:Int,b:Int ){

	
	var x=a;
	var y=b;

	def add(p:Int,q:Int){
	x=x+p;
	y=y+q;

	println("X after Addition:"+x);
	println("Y after Addition:"+y);
	}

}

object MethodDemo{
	
	def main(args:Array[String]){

	var cmd=new ClassMethodDemo(20,40);

	cmd.add(40,20);
	}
}