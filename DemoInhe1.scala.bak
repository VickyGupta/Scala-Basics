class Inh(val a: Int,val b: Int){
	
	val x=a;
	val y=b;

	def add(){
	val z=x+y;
	println(z);

	}

}

class InheDemo(override val a: Int,override val b:Int,val c:Int) extends Inh(a,b){
					
					//override keyword overrides the existing value or implementation logic which is defined earlier
	override val x=a;
	override val y=b;
	val z=c;

	override def  add(){
	val w=x+y+z;
	println(w);

	}
}

object DemoInhe1{

	def main(args:Array[String]){
		val v=new InheDemo(1,2,3);
		v.add();
	}
}