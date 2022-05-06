import java.io.File

object ArgsFromFolder extends App {
  def getListOfFiles(dir: String):List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.toList
    } else {
      List[File]()
    }
  }
println(getListOfFiles(args(0)))
}
