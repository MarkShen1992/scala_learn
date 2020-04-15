package demo

import java.math.BigInteger

object T008List {
  def main(args: Array[String]): Unit = {
    val oneTwoThree = List(1, 2, 3)
    oneTwoThree.foreach(print)

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)

    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFour + " is a new list.")

    val twoThree = List(2, 3, 1)
    var oneTwoThree2 = 1 :: twoThree
    // val temp = oneTwoThree2 :: 2
    println(oneTwoThree2)
    
    val oneTwoThree3 = 1 :: 2 :: 3 :: Nil
    println(oneTwoThree3)
  }
}