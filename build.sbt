name := "mustache"
organization := "com.researchnow"

version := "2.1"
scalaVersion := "2.13.12"
javacOptions := Seq("-source", "1.8", "-target", "1.8")
scalacOptions ++= Seq("-unchecked", "-deprecation", "-target:jvm-1.8")
crossScalaVersions := Seq("2.11.12", "2.12.13", "2.13.12")

libraryDependencies ++= Seq(
  "org.jline" % "jline" % "3.19.0" % "test",
  "junit" % "junit" % "4.13.1" % "test",
  "org.specs2" %% "specs2-core" % "4.10.6" % "test",
  "org.specs2" %% "specs2-junit" % "4.10.6" % "test"
)
