package demo

object Loop {
  def main(args: Array[String]): Unit = {
    var sum = 0
    var i = 1
    while (i <= 100) {
      sum += i
      i += 1
    }
    println(sum)
  }
}