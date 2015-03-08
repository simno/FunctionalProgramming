package com.test.fp.chapter2.sorting

import org.scalatest._
import com.fp.chapter2.currying.Currying._

class CurryingTestSuite extends FunSuite with Matchers {
  
  test("Test that we can curry Integer functions") {
    val add = curry[Int, Int, Int]((a: Int, b: Int) => a + b)
    val plusFive = add(5)
    plusFive(10) should be (15)
  }
  
  test("Test that we can curry String functions") {
    val add = curry[String, String, String]((a: String, b: String) => b + a)
    val plusWorld = add("World")
    plusWorld("Hello") should be ("HelloWorld")
  }
  
  test("Test that we can curry Array functions") {
    val multiply = curry[Int, Array[Int], Array[Int]]((a: Int, b: Array[Int]) => b.map(_ * a))
    val arrayTimesFive = multiply(5)
    arrayTimesFive(Array[Int](1, 5, 10)) should be (Array[Int](5, 25, 50))
  }

}