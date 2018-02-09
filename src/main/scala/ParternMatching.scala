object parternMatching {

  case class Note(var name: String, var duration: String, var octave: Int) {

  }

  def main(args: Array[String]): Unit = {

    val c3 = Note("C", "Quarter", 3)
    //c3.name = "aa"
    val cThree = Note("C", "Quarter", 3)
    println(c3 == cThree)
  }


}
