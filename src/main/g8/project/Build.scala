import sbt._
import Keys._

object AppBuild extends Build {

  lazy val rootProject = Project(id = "root", base = file("."), settings = rootSettings)

  lazy val rootSettings: Seq[Project.Setting[_]] = Defaults.defaultSettings ++ Seq(
    sbtPlugin := false,
    organization := "$organization$",
    name := "$name$",
    version := "0.0.1",
    resolvers ++= Seq(
      "typesafe releases" at "http://repo.typesafe.com/typesafe/releases",
      "sonatype releases" at "http://oss.sonatype.org/content/repositories/releases/"
    ),
    libraryDependencies <++= (scalaVersion) { scalaVersion =>
      Seq(
        "org.scalatest" %% "scalatest" % "1.7.2" % "test"
      )
    },
    scalacOptions ++= Seq("-deprecation", "-unchecked")
  )

}
