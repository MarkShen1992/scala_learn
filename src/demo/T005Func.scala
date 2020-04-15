package demo

object T005Func {
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
  
  def greet() = println("Hello, world!")

  def main(args: Array[String]): Unit = {
    println(max(3, 4))
    println(greet())
    
    // Say hello to the first argument
    // println("Hello, " + args(0) + "!")
  }
}