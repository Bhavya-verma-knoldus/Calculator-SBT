name := "SBT Assignment"

version := "0.1"

scalaVersion := "2.12.12"

lazy val calculator = project.in(file("calculator"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % "test"
  )

lazy val root = project.in(file(".")).aggregate(calculator)