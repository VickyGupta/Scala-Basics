import scala.collection.mutable.ArrayBuffer

object CollectionArrayBuffer extends App{

    var a=ArrayBuffer(1,2,3)
    println(a)

    a = a +=4
    a = a += (5,6)
    println(a)

    a= a -= 1
    a= a-= (2,3)

    a = a ++ Vector(7,8)
    println(a)

    a.clear()
     println(a)


    val a1 = ArrayBuffer(1, 2, 3)
    a1.append(4)
    a1.append(5, 6)                  //appending elements to ArrayBuffer(inserting at last)
    a1.appendAll(Seq(7,8))           //appending collection to ArrayBuffer
    println(a1)

    a.clear                         //removing all elements from collection
    println(a)

    val a2 = ArrayBuffer(9, 10)      //insert methods first argument is Index remaining are the elements which will be inserted from that index
      
    a2.insertAll(0, Vector(4, 5))     //inserting collection from  perticular position  onward  
    a2.prepend(3)
    a2.prepend(1, 2)                 //inserting from satrting point 
     a2.prependAll(Array(0))
     a2.insert(0, 8)                  //inserting at perticular position i.e. at zero th location  
    a2.insert(0, 6, 7)               //inserting element from  perticular position  onward 

    println(a2)

    a2.remove(0)            //remove methods arguments are Indexex ie it will renoves elements using elements indexes
    a2.remove(1,2)
    println(a2)





}