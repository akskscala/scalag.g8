import sbt._
import sbt.Keys._
import scalag._

object MyScalagDef extends Plugin {

  ScalagPlugin.addCommands(builtin.all:_*)

  ScalagPlugin.addCommand(
    namespace = "echo",
    args = Seq("path", "content"),
    description = "Writes the content",
    operation = { case ScalagInput(path :: content :: Nil, settings) =>
      FilePath(path).writeIfNotExists(content, "UTF-8")
    }
  )

}

