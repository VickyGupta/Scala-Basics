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

    def getAnimal(s: String): Animal = {
        if (s == "Dog") return new Dog
        else return new cat
}
}

object FactoryDemoUsingGetterMethod{
    def main(args:Array[String]){
        val cat = Animal.getAnimal("cat") // returns a Cat
       val dog = Animal.getAnimal("Dog") // returns a Dog

        dog.speak;
        cat.speak;
    }

}