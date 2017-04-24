object CollectionLoopingUsingForEach extends App{

    val longWords = new StringBuilder

    "Hello world it's DDA".split(" ").foreach{ e =>     // => transformation symbol takes every word from string and transforms onto new one
    if(e.length > 4)  {
        longWords.append(s" $e")
        println(longWords)
    }
    else println("Not added: " + e)             
    }


    //Looping over Map using froeach Looping

    val map=Map("a"->1,"b"->2,"c"->3)
    println(map)

    map.foreach(x =>
                   println(s"key: ${x._1} value: {$x._2}") 
    )

    //Looping over Map using froeach Looping using case keyword

    map.foreach{
        case(v,index) => println(s"Key: $v, value: $index")
        // case(movie, rating) => println(s"key: $movie, value: $rating")

    }


    //using for Looping

    val fruits = Array("apple", "banana", "orange")

    for ((elem, count) <- fruits.zipWithIndex) {        //index starts from its default position i.e. zero
        println(s"element $count is $elem")
    }

   for ((elem,count) <- fruits.zip(Stream from 1)) {    //index starts from its specidied position 
        println(s"element $count is $elem")
   }


   //for with yield method

   val vector=Vector("A","AA","ABC","B","BC","C","DC");
   val v1=for{
        v <- vector
        if v.startsWith("A")
   }yield v

   println(v1)
   

}