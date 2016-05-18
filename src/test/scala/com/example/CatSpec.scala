package com.example

import org.scalatest.{FlatSpec, Matchers}

class CatSpec extends FlatSpec with Matchers {

  val cat = new Cat

  "A cat" should "Meow!" in {
      cat.vocalise should be("Meow!")
  }
}
