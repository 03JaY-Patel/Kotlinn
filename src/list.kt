fun main(){
    val numbers = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    val evenNumbers = numbers.filter { it %2 == 0 }
    val (even,odds) = numbers.filter { it %2 ==0 }
    println(evenNumbers)
    println("//-------------------")
    println(even)
}