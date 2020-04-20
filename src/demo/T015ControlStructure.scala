package demo

import java.io.File

object T015ControlStructure {
  def main(args: Array[String]): Unit = {
    var fileName = "default.txt"
    if (!args.isEmpty) {
      fileName = args(0)
    }
    println(fileName)

    val fileName2 =
      if (!args.isEmpty)
        args(0)
      else
        "default.txt"
    println(fileName2)

    println(if (!args.isEmpty) args(0) else "default.txt")

    println(gcdLoop(12, 6))

    var line = ""
    do {
      line = readLine() // standard input
      println("Read: " + line)
    } while (line != "")

    //  current directory,"."
    val filesHere = (new java.io.File(".")).listFiles
    for (file <- filesHere)
      println(file)

    println()

    for (i <- 0 to filesHere.length - 1)
      println(filesHere(i))

    println()

    for (file <- filesHere if file.getName.endsWith(".git"))
      println(file)

    println()

    for (file <- filesHere)
      if (file.getName.endsWith(".git"))
        println(file)

    println()

    for (
      file <- filesHere if file.isFile if file.getName.endsWith(".git")
    ) println(file)

    for (i <- 1 to 4)
      println("Iteration " + i)

    for (i <- 1 until 4)
      println("Iteration " + i)

    println(() == greet())

    grep(".*gcd.*", filesHere)

    grep2(".*gcd.*", filesHere)

    println(scalaFiles(filesHere))

    for (file <- filesHere if file.getName.endsWith(".scala")) {
      // yield file // Syntax error!
      println(file.getName)
    }

    val forLineLengths =
      for {
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(".*for.*")
      } yield trimmed.length

    val firstArg = if (args.length > 0) args(0) else ""
    firstArg match {
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?") // default
    }

    val friend =
      firstArg match {
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"
      }
    println(friend)

    var i = 0
    var foundIt = false
    while (i < args.length && !foundIt) {
      if (!args(i).startsWith("-")) {
        if (args(i).endsWith(".scala"))
          foundIt = true
      }
      i = i + 1
    }

    import scala.util.control.Breaks._
    import java.io._
    val in = new BufferedReader(new InputStreamReader(System.in))
    breakable {
      while (true) {
        println("? ")
        if (in.readLine() == "") break
      }
    }
    
    def searchFrom(i: Int): Int =
    		if (i >= args.length) -1
    		else if (args(i).startsWith("-")) searchFrom(i + 1)
    		else if (args(i).endsWith(".scala")) i
    		else searchFrom(i + 1)
    val j = searchFrom(0)
    
    // VARIABLE SCOPE：出了大括号，就没有别人认识这个变量了
  }

  def scalaFiles(filesHere: Array[File]) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  def grep2(pattern: String, filesHere: Array[File]) = for {
    file <- filesHere
    if file.getName.endsWith(".gitignore")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def grep(pattern: String, filesHere: Array[File]) =
    for (
      file <- filesHere if file.getName.endsWith(".gitignore");
      line <- fileLines(file) if line.trim.matches(pattern)
    ) println(file + ": " + line.trim)

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def gcd(x: Long, y: Long): Long =
    if (y == 0) x else gcd(y, x % y)

  def greet() = { println("hi") }
}