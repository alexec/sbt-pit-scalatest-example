package com.example

import org.scalatest.{FlatSpec, Matchers}

class DogSpec extends FlatSpec with Matchers {

  val dog = new Dog

  "A dog" should "Bark" in {
      dog.vocalise should be("Bark")
  }

  "A dog" should "be hairy" in {
    dog.hairy should be(true)
  }
}
