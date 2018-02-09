object Outer {
  class Inner {
    // private, projected, default is public
    def f(){println("f")}
    class InnerMost {
      f();
    }
  }
}

object AccessModifier {
  def main(args: Array[String]): Unit = {
    new Outer.Inner().f()
  }

}
