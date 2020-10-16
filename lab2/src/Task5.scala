object Task5 {

  def Validation(args: Array[String]): Boolean = {
    if(args(1) == "deg") return true;
    else return false;
  }
  def Print_10deg_sin(arg: Double): Unit = {
    println("\nsin(arg +- 10deg) is : ");
    for( i <- -10 to 10){
      print(scala.math.sin(arg + i));
      print(" ");
    }
  }
  def Print_10deg_cos(arg: Double): Unit = {
    println("\ncos(arg +- 10deg) is : ");
    for( i <- -10 to 10){
      print(scala.math.cos(arg + i));
      print(" ");
    }
  }
  def Print_10deg_tan(arg: Double): Unit = {
    println("\ntan(arg +- 10deg) is : ");
    for( i <- -10 to 10){
      print(scala.math.tan(arg + i));
      print(" ");
    }
  }
  def radToDeg(args: Array[String]): Double = {
    return args(0).toDouble * 180.0/scala.math.Pi;
  }

  def main(args: Array[String]): Unit ={
    if(Validation(args)){
      Print_10deg_cos(args(0).toDouble);
      Print_10deg_tan(args(0).toDouble);
      Print_10deg_sin(args(0).toDouble);
    }
    else{
      Print_10deg_cos(radToDeg(args));
      Print_10deg_tan(radToDeg(args));
      Print_10deg_sin(radToDeg(args));
    }
  }
}
