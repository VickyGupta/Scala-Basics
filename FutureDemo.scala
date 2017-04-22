
import scala.concurrent.{Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.util.Random
object FutureDemo extends App {
println("starting calculation ...")
val f = Future {
//sleep(Random.nextInt(500))
42
}

f onComplete {
case Success(value) => println(s"Got the callback, meaning = $value")
case Failure(e) => e.printStackTrace
}
}