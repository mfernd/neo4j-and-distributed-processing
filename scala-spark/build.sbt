import Dependencies._

ThisBuild / scalaVersion     := "2.12.18"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "fr.umontpellier.polytech"
ThisBuild / organizationName := "Polytech Montpellier"

lazy val root = (project in file("."))
  .settings(
    name := "scala-spark",
    libraryDependencies += munit % Test
  )

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.5"
