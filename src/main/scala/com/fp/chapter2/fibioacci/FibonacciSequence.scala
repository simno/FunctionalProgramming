package com.fp.chapter2.fibioacci

object FibonacciSequence {
  
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(first: Int, second: Int, n: Int): Int = {
      if(n == 1) second
      else go(second, first + second, n - 1)
    }
    go(0, 1, n)
  }

}