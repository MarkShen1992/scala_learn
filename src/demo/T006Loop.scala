package demo

object T006Loop {
  def main(args: Array[String]): Unit = {
    var sum = 0
    var i = 1
    while (i <= 100) {
      sum += i
      i += 1
    }
    println(sum)
    
    val greetInts = new Array[Int](3)
    greetInts(0) = 1
    greetInts(1) = 2
    greetInts(2) = 3
    
    greetInts.foreach(arg => println(arg))
    greetInts.foreach((arg: Int) => println(arg))
    greetInts.foreach(print)
    
    for (greetInt <- greetInts) {
      print(greetInt)
    }
  }
}