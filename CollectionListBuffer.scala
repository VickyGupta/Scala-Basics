import scala.collection.mutable.ListBuffer
object CollectionListBuffer{

    def main(args:Array[String]){

        var listBuff=new ListBuffer[String]();		//ListBuffer is immutable collection

        listBuff +="A";
           listBuff +="B";
              listBuff +="c";			//  += used for adding elements forListBuffer

              println(listBuff);

             val l= listBuff.toList;	     //toList is method which converts listbuffer to List

             val aa=l.toArray		    //toArray is method which convers list to Array

             println(l);


    }

}