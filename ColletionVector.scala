object ColletionVector extends App{

      val v=Vector(1,2,3,4)      //creating collection i.e. vactor 
      println(v)            //Vector is a collection type  that addresses the inefficiency for random access on lists. 
                            //Vectors allow accessing any element of the list in ‘effectively’ constant time ... 
                            //Because vectors strike a good balance between fast random selections and fast random functional updates, 
                            //they are currently the default implementation of immutable indexed sequences

      val v1=v :+ 4           //appending value to collection
      println(v1)

      val v2= v1 ++ v       //concating two collection if both type of collections are same
      println(v2)


      val v3=v2.filter(_>2)     //filters the record from colletion acording to condition iven
      println(v3)

      val v4=v2.take(6)         //returns the first n elements from collection according to given size
      println(v4)


}