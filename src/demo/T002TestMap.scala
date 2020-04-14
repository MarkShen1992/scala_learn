
package demo

object TestMap {
  def main(args: Array[String]): Unit = {
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
    print(capital)
  }
}