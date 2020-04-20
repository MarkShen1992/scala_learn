package demo

import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.net.MalformedURLException
import java.net.URL

object T016ExceptionHandle {
  def main(args: Array[String]): Unit = {
    val n = Integer.parseInt(readLine())

    val half =
      if (n % 2 == 0)
        n / 2
      else
        throw new RuntimeException("n must be even")
    println(half)

    try {
      val f = new FileReader("input.txt")
      // Use and close file
    } catch {
      case ex: FileNotFoundException => // Handle missing file
      case ex: IOException => // Handle other I/O error
    }

    val file = new FileReader("input.txt")
    try {
      // Use the file
    } finally {
      file.close() // Be sure to close the file
    }
  }
  
  def urlFor(path: String) =
		  try {
			  new URL(path)
		  } catch {
		  case e: MalformedURLException =>
		  new URL("http://www.scala-lang.org")
		  }
  
  def f(): Int = try return 1 finally return 2
  
  def g(): Int = try 1 finally 2
}