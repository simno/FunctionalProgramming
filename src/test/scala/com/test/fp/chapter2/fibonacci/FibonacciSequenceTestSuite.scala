package com.test.fp.chapter2.fibonacci

import org.scalatest._
import com.fp.chapter2.fibonacci.FibonacciSequence.fib

class FibonacciSequenceTestSuite extends FunSuite with Matchers {

  test("1 is the 1st Fibonacci Number") {
    fib(1) should be (1)
  }
  
  test("5 is the 5th Fibonacci Number") {
    fib(5) should be (5)
  }
    
  test("610 is the 15th Fibonacci Number") {
    fib(15) should be (610)
  }
    
}