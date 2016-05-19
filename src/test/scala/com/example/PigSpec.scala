package com.example

import org.scalatest.{FlatSpec, Matchers}

class PigSpec extends FlatSpec with Matchers {

  val pig = new Pig

  "A pig" should "Oink" in {
    // rubbish test
      pig.vocalise
  }
}
