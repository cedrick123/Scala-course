object Task4{

  def ArrayOfStringsToArrayOfChar(args: Array[String]): Array[Char] ={
    var arrayChar =  new Array[Char](2);
    arrayChar(0) = args(0).charAt(0)
    arrayChar(1) = args(1).charAt(0)

    return arrayChar.sorted;
  }

  def Validate(args: Array[String]): Boolean = {
    if(args.length < 2){
      print("Please provide two arguments")
      return false
    }
    var newArray = ArrayOfStringsToArrayOfChar(args);
    if(newArray(0).isLetter && newArray(0).isLetter){
      return true
    }
    else{
      print("Please provide only letters");
      return false;
    }
  }
  def initializeNewArrayOfInt(args: Array[String]): Array[Int] ={
    var newArrayChar = ArrayOfStringsToArrayOfChar(args);
    val newArrayInt = (newArrayChar(0).toInt to newArrayChar(1).toInt).toArray;
    return newArrayInt
  }
  def printer(args: Array[String]): Unit ={
    var x = initializeNewArrayOfInt(args);
    var newArrayofChar =  (x(0).toChar to x(x.length - 1).toChar).toArray[Char];
    newArrayofChar.foreach { i => print(s"${i} ")}
  }

  def main(args: Array[String]): Unit ={
    if(Validate(args)) {
      printer(args)
    }


  }
}