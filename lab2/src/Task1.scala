import scala.:+

object Task1 {
  def AreaOfRectangle(arg: (Double,Double)):Double = {
    return arg._1*arg._2;
  }
  def WhichRectangleHaveAreaBiggerThen_2nd_argument(arg: List[(Double,Double)]): List[(Double, Double)] = {
    var list : List[(Double,Double)] = List();
    arg.foreach(x => if(AreaOfRectangle(x) > x._2){
      list = list:+x;
    })
    return list
  }
  def PrintRectangleDetails(arg: (Double,Double)): Unit ={
    println(s"(${arg._1},${arg._2}) = > area: ${AreaOfRectangle(arg)}")
  }

  def main(args: Array[String]): Unit ={
    val list1 : List[(Double,Double)] = List((0.212, 2.2123),(0.12873612873,2.123897123),(2.12873612873,2.123897123),(0.876562873612873,2.123897123),(12.1232873612873,2.123897123));
    val list2 = List((1.123123123,5.3123123),(8.5435435345,9.12312371351));
    var list3 : List[(Double,Double)] = List()
    list3 = list3 :+ (1.123,2.123);
   println(WhichRectangleHaveAreaBiggerThen_2nd_argument(list1))
    list1.foreach(x => if(AreaOfRectangle(x) > 14) {
     PrintRectangleDetails(x)
    }
    )
  }
}
