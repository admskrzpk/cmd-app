import java.io.File

object ArgsFromFolder extends App {
  def getListOfFiles(dir: String) = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.map(_.getName).toList.foreach(println)
    } else {
      List[File]()
    }
  }
getListOfFiles(args(0))
}