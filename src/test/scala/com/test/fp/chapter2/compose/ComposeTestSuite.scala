package com.test.fp.chapter2.sorting

import org.scalatest._
import com.fp.chapter2.compose.Compose._

class ComposeTestSuite extends FunSuite with Matchers {
  
  test("Test caluclating cosine") {
    def g = (x: Double) => Math.PI / 2 - x
    def f = Math.sin(_)
    def cos = compose(f, g)
    cos(1) should be (0.5403023058681397)
  }

}