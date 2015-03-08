package com.test.fp.chapter2.sorting

import org.scalatest._
import com.fp.chapter2.sorting.SortValidation._

class SortValidationTestSuite extends FunSuite with Matchers {
  
  test("[A, B, C] is sorted") {
    isSorted[Char](Array[Char]('A', 'B', 'C'), characterCompare) should be (true)
  }
  
  test("[A, C, B] is not sorted") {
    isSorted[Char](Array[Char]('A', 'C', 'B'), characterCompare) should be (false)
  }
  
  test("[Apple, Bannana, Carrot] is sorted") {
    isSorted[String](Array[String]("Apple", "Bannana", "Carrot"), stringCompare) should be (true)
  }
  
  test("[Apple, Carrot, Bannana] is not sorted") {
    isSorted[String](Array[String]("Apple", "Carrot", "Bannana"), stringCompare) should be (false)
  }
  
  test("[1, 2, 3] is sorted") {
    isSorted[Int](Array[Int](1, 2, 3), digitCompare) should be (true)
  }
  
  test("[1, 3, 2] is not sorted") {
    isSorted[Int](Array[Int](1, 3, 2), digitCompare) should be (false)
  }

}