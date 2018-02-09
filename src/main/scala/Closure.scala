object closure {


  def main(args: Array[String]): Unit = {
    val multiplier = (i:Int) => i * 10;
    println(multiplier(100));
  }

}
