trait Animal{

    def speak
}

object Animal{

    class cat extends Animal{
        override def speak{
            println("cat_speak")
        }
    } 
    class Dog extends Animal{
        override def speak{
            println("Dog_speak")
        }
    }

    def apply(s: String): Animal = {
        if (s == "Dog") new Dog
        else new cat
    }
}

object FactoryDemo{
    def main(args:Array[String]){
        val cat = Animal("cat") // returns a Cat
       val dog =  Animal("dog") // returns a Dog
       cat.speak
       dog.speak

    }

}