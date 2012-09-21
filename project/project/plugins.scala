import sbt._

object PluginDef extends Build {
  lazy val root = Project("plugins", file(".")) dependsOn(
    ProjectRef(uri("git://github.com/n8han/giter8#0.5.0-RC1"), "giter8-plugin")
  )
}
