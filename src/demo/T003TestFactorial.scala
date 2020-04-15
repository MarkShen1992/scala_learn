package demo

import java.math.BigInteger

object T003TestFactorial {

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)

  def factorial(x: BigInteger): BigInteger =
    if (x == BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(factorial(x.subtract(BigInteger.ONE)))

  def main(args: Array[String]): Unit = {
    println(factorial(30))
  }
}