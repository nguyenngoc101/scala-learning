import scala.concurrent.Future
import scala.util.{Failure, Random, Success}
import scala.concurrent.ExecutionContext.Implicits.global



object concurency {

  def someLongRunningThing() = {

  }

  def sleep(duration: Int) = {Thread.sleep(duration)}

  def main(args: Array[String]): Unit = {
    println("1 - starting calculation ...")
    val f = Future {
      sleep(Random.nextInt(500))
      "dfadf"
    }


    for {
     r1 <- f
     r2 <- f
     r3 <- f
    } yield (r1+r2+r3)


    println("2- before onComplete")
    f.onComplete {
      case Success(value) => println(s"Got the callback, meaning = $value")
      case Failure(e) => e.printStackTrace
    }

      // do the rest of your work
    println("A ..."); sleep(100)
    println("B ..."); sleep(100)
    println("C ..."); sleep(100)
    println("D ..."); sleep(100)
    println("E ..."); sleep(100)
    println("F ..."); sleep(100)
  }

}
