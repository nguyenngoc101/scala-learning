import Array._
//import scala.collection.mutable.Set
import scala.collection.immutable.Set

object collection {

  def main(args: Array[String]): Unit = {
//    _array()
//    _list()
    _set()
  }

  def _array(): Unit = {
    //var myList = Array(1, 2, 3,4)
    var myMatrix = ofDim[Int](3,3)

      // build a matrix
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            myMatrix(i)(j) = j;
         }
      }

      // Print two dimensional array
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            print(" " + myMatrix(i)(j));
         }
         println();
      }
  }

  def _list() : Unit = {
    val person = new Person("Ngoc")
    val persons1 = List(new Person("Ngoc"), new Person("Van"))
    val persons2 = List(new Person("Nguyen"), new Person("Tran"))
    val persons = persons1:::persons2.tail
    persons.foreach(e => println(e.getName()))
  }

  def _set() : Unit = {
    var person1 = new Person("Ngoc")
    var person2 = new Person("Van")
    var person3 = new Person("Nguyen")
    var persons = Set(person1, person2)
    var personSet = persons.+(person3)
    person1.setName("adsfasd")
    println(persons.head.getName())
    println(personSet.size)
  }

  class Person(var name : String) {
    def getName() : String = {
      return name;
    }

    def setName(name: String) : Unit = {
      this.name = name;
    }

    override def equals(obj: scala.Any): Boolean =
      obj match {
        case obj: Person => obj.hashCode() == this.hashCode()
        case _ => false
      }

    override def hashCode(): Int = this.name.hashCode
  }
}
