package com.scala

import scala.collection.mutable.ArrayBuffer

/**
 * Hello world!
 *
 */
object test {
  def main(args: Array[String]): Unit = {

    val list = new ArrayBuffer[Int]()
    for (a <- 1 to 10) {
      list += a
    }
    println(list)
  }

}