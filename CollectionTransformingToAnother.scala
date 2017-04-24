//import java.util.Arrays
object CollectionTransformingToAnother extends App{

    val v=Vector("ajay","amit","aman")
    val cap=v.map(c => c.capitalize)
    val cap1=v.map(_.capitalize)    //using wild character

    println(cap)
    println(cap1)

    val s="amar , ajay , aman, amit, amol";
    val s1= s.split(",").map(_.trim)
   // println(Arrays.toString(s1))

   s1.foreach{
       println
   }


   val flatlist=List(List(4,5),List(1,2));
   val list=flatlist.flatten.sorted               //flatten method is used for creating single collection from collection of collection i.e. like List from List(LIST)  
                                                // sorted method is used for sorting the elements in the collection              

   println(flatlist)
   println(list)

    //use flatMap with an Option


   val bag = List("1", "2", "three", "4", "one hundred seventy five")

   def info(s:String):Option[Int]={
       try{
            Some(Integer.parseInt(s))
       }
       catch{
           case e:Exception => None
       }

   }

  println( bag.flatMap(info).filter(_ > 1))        //finding elements which is greatter than 1 using filter method

   println( bag.flatMap(info).takeWhile(_ < 4))       //finding elements which is less than 4 using takeWhile method

   println( bag.flatMap(info).partition(_ > 3))        //finding elements which is less than 4 using partition method

   println(bag.flatMap(info).sum)


    val findMax = (x: Int, y: Int) => {   
    val winner = x max y    
    winner
    }

    val a = Array.range(0,50)
   println( a.reduce(findMax))

   val b=Vector(1,2,3,4,5,6,7,8,65,34,2,2,5,7,3,121,3)
   println(b)
   println(b.distinct)                      //returns the unique elements from collection

}