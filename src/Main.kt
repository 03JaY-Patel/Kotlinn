fun main() {
    var a = 10
    var b = 20
    var c = 5
//    val name = "xyz"
//    val sum =a+b+c
//    val product = a*b*c
   // var b = 10
//   val name1 ="Mary"
//    val age = 20

 //   println("$name1 is $age years Old.")

//    println("sum of  All numbers is ${a+b+c};")    // operation is included  in the code!!(String templates)
//    println("sum of  All numbers is $sum ;")      // variable is created for the operation!!
   // println(name)
//    println("Product of the Numbers: $product")

    println("Before any Augmented operation -->  A = $a ")
    println("Before any Augmented operation -->  B = $b ")
    println("Before any Augmented operation -->  C = $c ")
    println("------------------------------------------------")
    println(" After Augmented oper..:-")
    a+= 10
    b-=15
    c*= (-10)
    println(" Applying this Equation: a+= 10")
    println(" Now A = ${a} ")
    println(" Applying this Equation: b-=15")
    println(" Now  B = ${b} ")
    println(" Applying this Equation: c*= (-10)")
    println(" Now  C = ${c} ")
}