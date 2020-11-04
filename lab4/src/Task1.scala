import scala.annotation.tailrec

object Task1 {
  def partition(arg: List[Int],predicate: (Int) => Boolean ): List[List[Int]] ={
  val x : List[Int] = List()
  val y: List[Int] = List()

    @tailrec
    def particulate(arg: List[Int],predicate: (Int) => Boolean,x:List[Int],y:List[Int]): List[List[Int]] = {
      if(arg.isEmpty){
        List(x,y)
      }
      else {
        if (predicate(arg.head)){
          val xx = x :+ arg.head
          particulate(arg.tail,predicate,xx, y)
        }
        else {
           val yy = y :+ arg.head
          particulate(arg.tail,predicate,x, yy)
        }
      }
  }
  particulate(arg, predicate, x,y)
}
  def main(args: Array[String]): Unit ={
    println(partition(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),_ % 2 == 0))
  }
}
