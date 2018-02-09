class Point(val xc: Int, val yc: Int) extends  test with test2 {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

class Location(override val xc: Int, override val yc: Int,
   var zc :Int) extends Point(xc, yc) with test {
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
   }
}


trait test {
  def sayHello(): Unit = {
    println("Say hello!")
  }

}

trait test2 {}

object Main {
   def main(args: Array[String]) {
      val loc = new Location(10, 20, 15);
     //loc.xc = 100;

      // Move to a new location
      //loc.move(10, 10, 5);
//     new Location(1,2,3).sayHello()
//
//println(new B().f())

     val c = C("aaa");
     C.test()

   }
}

class A(name:String, age:Int) {
  var a:String = "helloWorld";
  def f() {
    println("name: " +name + " age: "+age)}

}

class B extends A(name = "dfad", age = 12) {

}

object C {
  def apply(name: String) = {
    println(name)
  }

  def test() = {
    println("test from C")
  }
}


case class Company(name: String)
