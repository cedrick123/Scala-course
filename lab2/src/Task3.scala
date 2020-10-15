import scala.:+
import scala.util.Random;
object Task3 {

  def generateNumerBeetween_0_1():Double = {
    val generator = new Random();
    val rand = (generator.nextDouble() % 1)
    return rand;
  }
  def generatePoint():(Double,Double) = {
    return (generateNumerBeetween_0_1,generateNumerBeetween_0_1)
  }
  def generatePointsOfQuantity(size: Int): List[(Double,Double)] = {
    var list = List[(Double, Double)]();
    for(x <- 0 to size -1){
      val point = generatePoint()
      list = point :: list
    }
    return list;
  }
  def distanceFrom_0_toPoint(arg: (Double,Double)):Double = {
    return scala.math.sqrt(scala.math.pow(arg._1-0,2)+scala.math.pow(arg._2-0,2));
  }

  def HowManyTimesPointIsInCircle(size: Int=10000):Int = {
    val tuple = generatePointsOfQuantity(size);
    var howManyTimesPointIsInCircle = 0;
    tuple.foreach(tuple => if(distanceFrom_0_toPoint(tuple) <= 1) howManyTimesPointIsInCircle += 1);
    return howManyTimesPointIsInCircle;
  }

  def Pi_calculator(size: Int = 10000): Unit ={
    print(4.0*(HowManyTimesPointIsInCircle(size) / size.toDouble));
  }
  def main(args: Array[String]): Unit ={
  Pi_calculator()
  }

}
