class AuxConstructor(var a:Int,var b:Int){

    println("Implicit constructor");
    println(a+"..."+b);

    def this( c:Int){                   //auxillary constructor...name is bydefalt this()...looks like this() method
    this(10,20);                    //calling primary constructor
    println("Auxillary constructor");
    println(c);
    }

}

object AuxillaryConstructor{
    def main(args:Array[String]){           
                                                //ceating two objects using diff constructors
        var c1=new AuxConstructor(1,2);     //calling primary constuctor whose argments are 2 integers 
        var c2=new AuxConstructor(1);           //calling auxillary constuctor whose argment is one integers 
    }
}


