sbtPlugin := true

organization := "com.modmountain"

name := "sbt-sass"

version := "0.2.0"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "Typesafe Releases Repository" at "http://repo.typesafe.com/typesafe/releases/",
  Resolver.mavenLocal
)

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.0.2")

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/ModMountain/sbt-sass"))

pomExtra := (
  <scm>
    <url>git@github.com:ModMountain/sbt-sass.git</url>
    <connection>scm:git:git@github.com:ModMountain/sbt-sass.git</connection>
  </scm>
  <developers>
    <developer>
      <id>sirsavary</id>
      <name>Jesse Savary</name>
      <url>http://www.jessesavary.com</url>
    </developer>
  </developers>
  )