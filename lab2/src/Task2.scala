object Task2 {
  def Validate(args: Array[String]): Array[String] ={
    if(args.isEmpty){
      return Array("50");
    }
    else return args;
  }
  def InputFromTerminal_ArrayStringToInt_Converter(args: Array[String]): Int = {
    val argss = Validate(args);
    return argss(0).toInt
  }
  def isNumberIsPerfectSquare(arg: Int): Boolean = if(scala.math.sqrt(arg.toDouble) % 1 == 0) return true else false

  def CreateListOfInts(args: Array[String]): List[Int] = {
   val list =  List.range(1, InputFromTerminal_ArrayStringToInt_Converter(args) + 1);
    return list
  }
  def PrintListOfInts(args: Array[String]): Unit ={
    val x = CreateListOfInts(args);
    x.foreach(i => if(i> 1){if(!isNumberIsPerfectSquare(i)) println(i)}
    else println(i)
    )
  }

  def main(args: Array[String]): Unit ={
    PrintListOfInts(args);
  }
}
