
package demo

object TestVariable {
  def main(args: Array[String]): Unit = {
    println(1 + 2)
    println(3.14)
    println(true)
    
    // specify a type explicitly if you wish
    val msg: String = "Hello World"
    // Scala inferred the type of msg to be String.
    val msg2 = "Hello World2"
    println(msg + " " + msg2)
    // If reassignment is what you want, you'll need to use a var
    // msg = "puma"
    
    var msg3 = "HelloWorld"
    println(msg3)
    msg3 = "Puma"
    println(msg3)
  }
}