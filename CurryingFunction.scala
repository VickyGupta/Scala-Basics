object CurryingFunction{
   def main(args: Array[String]) {
      val str1:String = "Hello, "
      val str2:String = "Scala!"
      
      println( "str1 + str2 = " +  strcat(str1)(str2) )
   }

   def strcat(s1: String)(s2: String) = {	//strcat is CurryingFunction which takes multiple elements
      s1 + s2
   }
}