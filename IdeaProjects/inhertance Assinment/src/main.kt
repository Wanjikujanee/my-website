

fun main() {
 //  var car=car("subaru","KPL","red")
 //  car.carry(50)
 //  car.identity()
    println(calculateParkingFees(8))
   var bus=Bus("nissan","KVW","grey", 64)
    println()
  //  println(bus.maxTripFare(150,50))
  //  bus.calculateParkingFees(4)
  //  println(bus.calculateParkingFees(8))
}


  open  class car(var make:String,var model:String,color:String,capacity:Int){
    fun carry(people:Int){
       var x=people
      if(x==people){
        println("carry $people passangers" )
        }
          else
             print("Over capacity by $people")
          }
    }
       fun identity( color: String,make: String, model: String){
          println("i am a $color $make  $model")
       }
    fun calculateParkingFees(hour:Int):Int {
       var k=hour*20
        return k

}



class Bus(var make: String,var model: String,var color:String,var capacity:Int){
    fun maxTripFare(fare:Double):Double{
        var maxfare=fare*capacity
        return maxfare
    }
      fun calculateParkingFees():String{
        var product=("hours *capacity ")
          return(product)
      }


    }












