package demo

object T014FunctionObjects {
  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    println(oneHalf)

    val oneHalf2 = new Rational2(1, 2)

    val oneHalf3 = new Rational3(1, 2)
    println(oneHalf3.toString())

    println(new Rational4(1, 3))

    println(new Rational6(1, 6))

    val oneHalf4 = new Rational6(1, 2)
    val twoThirds = new Rational6(2, 3)
    println(oneHalf4 add twoThirds)
    val r = new Rational6(1, 2)
    println(r.denom)
    println(r.numer)

    println(new Rational6(3))
  }
}

class Rational(n: Int, d: Int)

class Rational2(n: Int, d: Int) {
  println("Created " + n + "/" + d)
}

class Rational3(n: Int, d: Int) {
  override def toString = n + "/" + d
}

/**
 * precondition of the primary constructor
 */
class Rational4(n: Int, d: Int) {
  require(d != 0)
  override def toString = n + "/" + d
}

/**
 * compile error
 */
//class Rational5(n: Int, d: Int) { // This won't compile
//  require(d != 0)
//  override def toString = n + "/" + d
//  def add(that: Rational): Rational =
//    new Rational(n * that.d + that.n * d, d * that.d)
//}

class Rational6(n: Int, d: Int) {
  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  // private fields and method
  private val g = gcd(n.abs, d.abs)

  // Õ·×ªÏà³ýËã·¨
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  // Auxiliary constructors in Scala start with def this(...).
  // every auxiliary constructor must invoke another constructor of the same class as its first action.
  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = numer + "/" + denom

  def add(that: Rational6): Rational6 =
    new Rational6(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def lessThan(that: Rational6) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational6) =
    if (this.lessThan(that)) that else this
}

class Rational7(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def + (that: Rational7): Rational7 =
    new Rational7(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  def + (i: Int): Rational7 =
    new Rational7(numer + i * denom, denom)
  def - (that: Rational7): Rational7 =
    new Rational7(
      numer * that.denom - that.numer * denom,
      denom * that.denom)
  def - (i: Int): Rational7 =
    new Rational7(numer - i * denom, denom)
  def * (that: Rational7): Rational7 =
    new Rational7(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational7 =
    new Rational7(numer * i, denom)
  def / (that: Rational7): Rational7 =
    new Rational7(numer * that.denom, denom * that.numer)
  def / (i: Int): Rational7 =
    new Rational7(numer, denom * i)
  implicit def intToRational(x: Int) = new Rational7(x)
}