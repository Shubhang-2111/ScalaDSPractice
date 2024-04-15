ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

val ScalaTestDependency = "org.scalatest" %% "scalatest" % "3.2.11" % Test

lazy val root = (project in file("."))
  .settings(
    name := "DSAQuestions"
  )

libraryDependencies ++= Seq(
  ScalaTestDependency
)

