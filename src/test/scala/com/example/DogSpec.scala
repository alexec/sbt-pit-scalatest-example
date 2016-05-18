package com.example

import org.scalatest.{BeforeAndAfterAll, FlatSpec, Matchers}

class DogSpec extends FlatSpec with Matchers with BeforeAndAfterAll {

  var ok = true
  val dog = new Dog

  override def beforeAll = {
    assert(ok)
    ok = false
  }

  override def afterAll = {
    ok = true
  }

  "A dog" should "Bark" in {
      dog.vocalise should be("Bark")
  }

  "A dog" should "be hairy" in {
    dog.hairy should be(true)
  }
}
