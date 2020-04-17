package demo.part01

import demo.part01.ChecksumAccumulator0.calculate

object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}