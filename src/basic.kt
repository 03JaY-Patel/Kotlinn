fun main(){

    val a= 12
    val b= 24
    val c= 20
    println("Number A : $a")
//    val a = readln().toDouble()
    println("Number B : $b ")
//    val b = readln().toFloat()
    println("Number C : $c")
//    val c = readln().toFloat()
    val sum = a+b+c
    val sub = a-b-c
    val multiplication = a*b*c
    println("The sum of $a , $c and $b is --> $sum")
    println(" The Subtraction $a - $b - $c = $sub")
    println(" The Multiplication $a * $b * $c = $multiplication")

    val cel =145
    val temp= (cel*(9/5)+32)
    println("\n //-----------Temperature---------------------//\n")
    println("Convert Temperature From Celsius to Fahrenheit")
    println("Temp in Cel: $cel")
    println("----- After Conversion ----")
    println("Temp in Fahrenheit : $temp")
}