sbtPlugin := true

organization := "com.modmountain"

name := "sbt-sass"

version := "0.2.0-SNAPSHOT"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "Typesafe Releases Repository" at "http://repo.typesafe.com/typesafe/releases/",
  Resolver.mavenLocal
)

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.0.2")