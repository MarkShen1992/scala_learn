package demo

import java.math.BigInteger

object T007Array {
  def main(args: Array[String]): Unit = {
    val big = new BigInteger("12345")
    println(big)

    /**
     * arrays in Scala are accessed by placing the index inside parentheses, not
     * square brackets as in Java. Thus the zeroth element of the array isgreetStrings(0), 
     * not greetStrings[0]
     */
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"

    for (i <- 0 to 2)
      print(greetStrings(i))

    println(greetStrings.length)

    for (i <- 0 to greetStrings.length - 1)
      print(greetStrings(i))
      
    /**
     * When you define a variable with val, the variable can't be reassigned, but the object to
     * which it refers could potentially still be changed.
     */
    val greetStrings2: Array[String] = new Array[String](3)
    greetStrings2(0) = "Hello"
    greetStrings2(1) = ", "
    greetStrings2(2) = "world!\n"
    
    for (i <- 0 to 2)
      print(greetStrings2(i))
    
    println()  
      
    greetStrings2(0) = "Hello"
    greetStrings2(1) = ", "
    greetStrings2(2) = "Mark!\n"
    
    for (i <- 0 to 2)
      print(greetStrings2(i))
      
    println()  
      
    greetStrings2.update(0, "Hello")
    greetStrings2.update(1, ", ")
    greetStrings2.update(2, "Mark!\n")
    
    for (i <- 0.to(2))
      print(greetStrings2.apply(i))
      
    val numNames = Array("zero", "one", "two")
    for (i <- 0.to(2))
      print(numNames.apply(i))
    
    println()
    
    val numNames2 = Array.apply("zero", "one", "two")
    for (i <- 0.to(2))
      print(numNames2.apply(i))
  }
}