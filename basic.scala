/*
   basics: https://docs.scala-lang.org/tour/basics.html

   * class

   * case class: a special type of "class", By default, case classes are immutable and comapred by value. You can define case classes with the `case class` keywords.

   * object: are single instances of their own definitions. You can think of them as singletons of their own classes. You can define objects with `object` keyword.

   * trait: are types containing certain fields and methods. Multiple traits can be combined. 

   * `object Main {...}` is an entry point of a program. The JVM requires a main method to be named `main` and take one argument, an array of strings.
*/


object Main {
	def main(args: Array[String]): Unit = 
		println("Hello, Scala developers!")
}