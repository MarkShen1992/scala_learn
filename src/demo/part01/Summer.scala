package demo.part01

import demo.part01.ChecksumAccumulator0.calculate

object Summer {
  def main(args: Array[String]) = {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}