name := "mustache"

organization := "com.researchnow"

version := "1.4"

scalaVersion := "2.12.8"

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += "Typesafe Snapshots Repository" at "https://repo.typesafe.com/typesafe/snapshots/"

  libraryDependencies ++= Seq(
    "junit" % "junit" % "4.8.1" % "test->default",
    "org.specs2" %% "specs2" % "2.4.17" % "test->default",
    "com.typesafe.akka" %% "akka-actor" % "2.4.12" % "test->default"
  )
