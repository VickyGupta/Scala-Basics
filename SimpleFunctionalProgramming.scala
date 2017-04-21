object SimpleFunctionalProgramming extends App{

    def demo(callback:() => Unit){      //it will take function as argument that having no argument and return type
        callback()
    }

    val hello=() => {
        println("hello");           ///function having no argument and return type
    }

    demo(hello)                 //calling function that having no argument and return type
}