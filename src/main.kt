fun main(){
    var y = Car("Toyota","Camry","Blue",12)
    y.carry(14)
    println(y.capacity)
    y.identity()
    println("${y.color} ${y.model} ${y.make}" )
    y.calculateParkingFees(8)
    var z = Bus("Mozine","Volvo","yellow",13)
     z.calculateParkingFees(6)



}
 class Bus(make:String,model:String,color:String,capacity:Int):Car(make, model, color, capacity) {
     fun maxTripFare(fare: Array<Double>): Double {
         var fare = Double.MAX_VALUE
         println(fare)
         return fare
     }

     override fun calculateParkingFees(hours: Int):Int{
         var b = hours * capacity
           println(b)
           return b
         //}

     }
 }
 open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x = people - capacity
        if (people<capacity) {
            println("Carrying and $people passengers")
        }
          else { println("Over capacity by $x people")
          }
    }
    fun identity(){
        println("I am a $color $model $make")
    }
   open fun calculateParkingFees(hours:Int):Int{
        var parkingFees = hours*20
       println(parkingFees)
        return parkingFees
    }
}

