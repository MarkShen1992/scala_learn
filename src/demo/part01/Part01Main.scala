package demo.part01

import demo.part01.ChecksumAccumulator0

object Part01Main {
  def main(args: Array[String]): Unit = {
    var cat = new Cat()
    println(cat.furColor)
    
    cat.furColor = "ºÚÉ«"
    println(cat.furColor)
    
    // println(cat.age)
    
    cat.setAge(10)
    println(cat.getAge())
    
    cat.setHeight(20)
    println(cat.getHeight())
    
    /**
     *  1. The line in question ends in a word that would not be legal as the end of a statement, 
     *  such as a period or an infix operator
     *  2. The next line begins with a word that cannot start a statement.
     *  3. The line ends while inside parentheses (...) or brackets [...], because these cannot 
     *  contain multiple statements anyway.
     */
    println(ChecksumAccumulator0.calculate("Every value is an object."))
  }
}