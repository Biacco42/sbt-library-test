name := "sbt-library-test"

organization := "info.biacco42.lib"

version := "0.1.0"

scalaVersion := "2.12.8"

publishTo := Some(Resolver.file("library-test", new File("./product")))