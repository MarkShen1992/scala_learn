package demo

import java.math.BigInteger

object T009Tuple {
  def main(args: Array[String]): Unit = {
    /**
     * Like lists, tuples are immutable, but unlike lists, tuples can
     * contain different types of elements. 
     */
    val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)
  }
}