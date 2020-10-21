import scala.annotation.tailrec
object Task2 {

  @tailrec
    def Counter(listOfPoints: List[(Int,Int)],firstPoint: (Int,Int),lastPoint: (Int,Int),count: Int = 0): Int = {
      if(listOfPoints.isEmpty) count
      else{
       val new_count = count + boolToInt(isInside(firstPoint,lastPoint,listOfPoints.head))
        Counter(listOfPoints.tail,firstPoint, lastPoint, new_count)
      }
  }

def boolToInt(arg: Boolean): Int = if(arg) 1 else 0

def isInside(leftBottomCorner: (Int, Int), rightTopCorner: (Int, Int), point: (Int, Int)): Boolean = {
  point._1 >= leftBottomCorner._1 && point._2 >= leftBottomCorner._2 && point._1 <= rightTopCorner._1 && point._2 <= rightTopCorner._2
}

  def main(arg: Array[String]): Unit = {
    val point1: (Int, Int) = (0,0)
    val point2: (Int, Int) = (10,10)
    val listOfPoints : List[(Int,Int)] = List ((0, 0), (1, 1), (10, 10), (11, 0), (0, 11))
    print(s"Number of points inside rectangle is ${Counter(listOfPoints,point1,point2)}\n")

  }
}
