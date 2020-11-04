object Task1 {

  class SDistance(val km: Int,val  m: Int,val  cm: Int) {



    override def toString: String = s"km: $km , Meters: $m, Centimeters: $cm."

     def ==(obj: SDistance):Boolean = {
      if(calculateToCentimitres(km,m,cm) == calculateToCentimitres(obj.km,obj.m,obj.cm)) true
      else false
    }
    def !=(obj: SDistance):Boolean = {
      if(calculateToCentimitres(km,m,cm) != calculateToCentimitres(obj.km,obj.m,obj.cm)) true
      else false
    }
    def <(obj: SDistance):Boolean = {
      calculateToCentimitres(km,m,cm) < calculateToCentimitres(obj.km,obj.m,obj.cm)

    }
    def >(obj: SDistance):Boolean = {
      if(calculateToCentimitres(km,m,cm) > calculateToCentimitres(obj.km,obj.m,obj.cm) ) true
      else false
    }

    import SDistance._
    def add(value: Int,enum: Value): SDistance = {
      enum match{
        case Kilometres => new SDistance(km+value,m,cm)
        case Metres => new SDistance(km,m+value,cm)
        case Centimetres => new SDistance(km,m,cm+value)
      }
    }
    def calculateToCentimitres(km: Int, m: Int, cm: Int): Int ={
      return km*100000+m*100+cm
    }
  }

  object SDistance extends Enumeration {
    type EnumType = Value
    val Kilometres, Metres, Centimetres = Value



    def apply(km : Int,m: Int, cm: Int): SDistance = {
      new SDistance(km,m,cm)
    }



  }

  def main(arg: Array[String]): Unit = {
    val firstDistance = SDistance(2, 2, 2)
    val secondDistance = SDistance(2, 2, 2)
    val thirdDistance = SDistance(2, 2, 3)
    val fourthDistance = SDistance(2, 2, 1)

    println("Distances:")
    println(firstDistance) // km: 2, Meters : 2, Centimeters: 2
    println(secondDistance) // km: 2, Meters : 2, Centimeters: 2
    println(thirdDistance) // km: 2, Meters : 2, Centimeters: 3
    println(fourthDistance) // km: 2, Meters : 2, Centimeters: 1

    println("2:")
    println(firstDistance == secondDistance) // true
    println(firstDistance != secondDistance) // false
    println(firstDistance > secondDistance) // false
    println(firstDistance < secondDistance) // false

    println("3:")
    println(firstDistance == thirdDistance) // false
    println(firstDistance != thirdDistance) // true
    println(firstDistance > thirdDistance) // false
    println(firstDistance < thirdDistance) // true
//
    println("4:")
    println(firstDistance == fourthDistance) // false
    println(firstDistance != fourthDistance) // true
    println(firstDistance > fourthDistance) // true
    println(firstDistance < fourthDistance) // false

    val fifthDistance = firstDistance.add(2, SDistance.Kilometres) // here you have to be able to add also meters or centimeters
    println(fifthDistance) // km: 4, Meters: 2, Centimeters: 2

  }

}
