name := "mustache"
organization := "com.researchnow"

version := "2.2"
scalaVersion := "2.13.14"
javacOptions ++= Seq("-source", "8", "-target", "8")
scalacOptions ++= Seq("-unchecked", "-deprecation")
crossScalaVersions := Seq("2.12.19", "2.13.14")

libraryDependencies ++= Seq(
  "org.jline" % "jline" % "3.26.2" % Test,
  "junit" % "junit" % "4.13.2" % Test,
  "org.specs2" %% "specs2-core" % "4.20.7" % Test, // last scala 2.12/2.13 version
  "org.specs2" %% "specs2-junit" % "4.20.7" % Test // last scala 2.12/2.13 version
)
