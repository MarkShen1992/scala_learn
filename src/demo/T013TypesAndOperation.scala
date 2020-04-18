package demo

object T013TypesAndOperation {
  /**
   * Basic type Range
   * Byte 8-bit signed two's complement integer (-27 to 27 - 1, inclusive)
   * Short 16-bit signed two's complement integer (-215 to 215 - 1, inclusive)
   * Int 32-bit signed two's complement integer (-231 to 231 - 1, inclusive)
   * Long 64-bit signed two's complement integer (-263 to 263 - 1, inclusive)
   * Char 16-bit unsigned Unicode character (0 to 216 - 1, inclusive)
   * String a sequence of Chars
   * Float 32-bit IEEE 754 single-precision float
   * Double 64-bit IEEE 754 double-precision float
   * Boolean true or false
   */
  def main(args: Array[String]): Unit = {
    /**
     * If an Int literal is assigned to a variable of type Short or Byte, the literal is
     * treated as if it were aShort or Byte type so long as the literal value is within
     * the valid range for that type.
     */
    val a: Byte = 10
    val b: Short = 100
    val c: Int = 1000 // default
    val d: Long = 10000L
    val e: Char = 'a'
    val f: Float = 3.14f
    val g: Double = 3.14 // default
    val h: String = "hello world"
    val i: Boolean = false

    val biggerStill = 123E45
    println(biggerStill)

    lazy val ch = '\u0041'
    println(ch)

    val backslash = '\\'
    println(backslash)

    /**
     * Literal Meaning
     * \n line feed (\u000A)
     * \b backspace (\u0008)
     * \t tab (\u0009)
     * \f form feed (\u000C)
     * \r carriage return (\u000D)
     * \" double quote (\u0022)
     * \' single quote (\u0027)
     * \\ backslash (\u005C)
     */
    val escapes = "\\\"\'"
    println(escapes)

    val multipleLine = """Welcome to Ultamix 3000.
      Type "HELP" for help."""
    println(multipleLine)

    println("""|Welcome to Ultamix 3000.
               |Type "HELP" for help.""".stripMargin)

    val s = 'aSymbol
    println(s)
    println(s.name)

    if (!i)
      println(true)

    val name = "reader"
    println(s"Hello, $name!")
    
    // raw s f
    println("The answer is ${6 * 7}.")
    println(s"The answer is ${6 * 7}.")
    println(raw"No\\\\escape!")
    println(f"${math.Pi}%.5f")
    
    val pi = "Pi"
    println(f"$pi is approximately ${math.Pi}%.8f.")
    
    val sum = 1 + 2
    println(sum)
    println(1.+(2))
    
    val longSum = 1 + 2L
    println(longSum)
    println(longSum.isInstanceOf[Long])
    
    val s2 = "Hello, world!"
    println(s2 indexOf 'o')
    println(s2.indexOf('o', 5))
    
    // ANY METHOD CAN BE AN OPERATOR
    var t = 12
    println(- t)
    println(t.unary_-)
    
    val s3 = "Hello, world!"
    println(s3.toLowerCase)
    println(s3 toLowerCase)
    
    println(1.2 + 2.3)
    println(3 - 1)
    println('b' - 'a')
    println(2L * 3L)
    println(11 / 4)
    println(11 % 4)
    println(11.0f / 4.0f)
    println(11.0 % 4.0)
    
    println(math.IEEEremainder(11.0, 4.0))
    
    val neg = 1 + -3
    println(neg)
    
    println(1 > 2)
    println(1 < 2)
    println(1.0 <= 1.0)
    println(3.5f >= 3.6f)
    println('a' >= 'A')
    
    val untrue = !true
    if (!untrue)
      println(true)
    
    val toBe = true
    val question = toBe || !toBe
    println(question)
    val paradox = toBe && !toBe
    println(paradox)
    
    // invoke method salt
    println(salt)
    println(pepper)
    println(salt && pepper)
    println(salt & pepper)
    
    // BITWISE OPERATIONS
    println(1 & 2)
    println(1 | 2)
    println(1 ^ 3)
    println(~ 1)
    // shift right (>>)
    println(1 >> 2)
    // shift left (<<)
    println(1 << 2)
    // unsigned shift right (>>>)
    println(1 >>> 2)
    
    // OBJECT EQUALITY == OR !=
    println(1 == 2)
    println(1 != 2)
    println(2 == 2)
    println(List(1, 2, 3) == List(1, 2, 3))
    println(List(1, 2, 3) == List(4, 5, 6))
    println(1 == 1.0)
    println(List(1, 2, 3) == "hello")
    println(List(1, 2, 3) == null)
    println(null == List(1, 2, 3))
    println(("he" + "llo") == "hello")
    
    println(0 max 5)
    println(0 min 5)
    println(-2.7 abs)
    println(-2.7 round)
    println(1.5 isInfinity)
    println((1.0 / 0) isInfinity)
    println(4 to 6)
    println("bob" capitalize)
    println("robert" drop 2)
    
    /**
     * Rich wrapper classes
     * Basic type Rich wrapper
     * Byte scala.runtime.RichByte
     * Short scala.runtime.RichShort
     * Int scala.runtime.RichInt
     * Long scala.runtime.RichLong
     * Char scala.runtime.RichChar
     * Float scala.runtime.RichFloat
     * Double scala.runtime.RichDouble
     * Boolean scala.runtime.RichBoolean
     * String scala.collection.immutable.StringOps
     */
  }
  
  def salt() = { println("salt"); false }
  
  def pepper() = { println("pepper"); true }
}