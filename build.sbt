import org.pitest.sbt.PitKeys._

name := "sbt-pit-scalatest-example"

organization := "com.example"

version := "1.0"

scalaVersion := "2.11.8"

// ScalaTest
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
libraryDependencies += "org.pitest" %% "pitest-scalatest-plugin" % "1.1.10-SNAPSHOT" % "test"

// Pitest
verbose := true
timestampedReports := false

