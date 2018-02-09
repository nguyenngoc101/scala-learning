import java.util

class HelloWorld {
  def main(args: Array[String]): Unit = {
    val author1 = new Author("Peter", "Pan");
    val author2 = new Author("Peter2", "Pan2");
    val list = List(author1, author2);
  }

  class Author(val firstName: String,
    val lastName: String) extends Comparable[Author] {

  override def compareTo(that: Author) = {
    val lastNameComp = this.lastName compareTo that.lastName
    if (lastNameComp != 0) lastNameComp
    else this.firstName compareTo that.firstName
    }
  }

  object Author {
    def loadAuthorsFromFile(file: java.io.File): List[Author] = ???
  }
}
