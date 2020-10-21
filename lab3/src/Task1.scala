object Task1 {

  def add:(Int,Int) => Int = (x,y) => x+y
  def multiplication:(Int,Int) => Int = (x, y) => x*y
  def divide:(Int,Int) => Int = (x,y) => x/y
  def subtract:(Int,Int) => Int = (x,y) => x-y

  def solveEquation(arg: String):Int = {
    val x = arg.split(" ").toList
    val y =  Map('+' -> add, '-' -> subtract, '*' -> multiplication, '/' -> divide)
    y(x(1).toCharArray.charAt(0))(x.head.toInt,x(2).toInt)
  }
  def main(arg: Array[String]): Unit = {
    val equation = "5 - 2"
    println(s"Answer: ${solveEquation(equation)}")
  }
}
