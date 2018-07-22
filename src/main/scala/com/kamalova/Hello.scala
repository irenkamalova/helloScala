package com.kamalova

import scala.runtime.LazyLong

// http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/

/*
An object in Scala is a singleton! This means there will be only one instance of this object within your application/JVM. The singleton pattern is such a commonly used pattern that Scala has built-in support for it.
 */
object Hello extends App  {
    println("Hello World from Scala!")
}
