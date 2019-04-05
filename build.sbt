name := "sbt-library-test"

version := "0.1"

scalaVersion := "2.12.8"

publishTo := Some(Resolver.file("library-test", new File("./product")))