object Task2 {
  class TDistance(val point1 :(Int,Int),val point2 :(Int,Int)){
    val dist = math.sqrt(math.pow(point2._1-point1._1,2)+math.pow(point2._2-point1._2,2))

  }
  class Formatted(val distance:Double) extends Human{
  val dist = distance

  }
  trait Human {
    def dist:Double
    def toHuman:String = {
      if(rightWhereYouAre) return s"Right where you are"
      if(inYourNeighborhood) return s"In your neighborhood"
      if(farAway) return s"Far away"
      else return s"Invalid"
    }
    def rightWhereYouAre:Boolean = dist == 0.0
    def inYourNeighborhood:Boolean = dist > 0.0 && dist < 10.0
    def farAway:Boolean = dist > 10

  }


  def main(args: Array[String]):Unit = {

    val x = new Formatted(5.0)
    println(x.toHuman)

    val z = new Formatted(25.0)
    println(z.toHuman) // Far away
    println(f"${z.rightWhereYouAre} ${z.inYourNeighborhood} ${z.farAway}")
    val dist = new TDistance((1, 1), (4, 4)) with Human
    println(dist.toHuman) // In your neighborhood// false false true
  }
}
