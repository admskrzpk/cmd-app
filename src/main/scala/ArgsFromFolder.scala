import scala.io.Source

object ArgsFromFolder extends App {
  val line = Source
    .fromFile(args(0))
    .getLines
    .flatMap(_.split("\\W+"))
    .foreach(println)
}
