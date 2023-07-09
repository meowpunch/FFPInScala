ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "RockTheJVM",
  )

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.15",
  "dev.zio" %% "zio-streams" % "2.0.15"
)
