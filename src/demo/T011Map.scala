package demo

import java.math.BigInteger
import scala.collection.mutable
import scala.collection.immutable.HashSet

object T011Map {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))

    val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
    println(romanNumeral(4))

    val res = formatArgs(Array("zero", "one", "two"))
    assert(res == "zero\none\ntwo")
  }

  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  def printArgs2(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg)
  }

  def printArgs3(args: Array[String]): Unit = {
    args.foreach(println)
  }

  def formatArgs(args: Array[String]) = args.mkString("\n")
}