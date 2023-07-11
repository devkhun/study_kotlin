import chapter01.CarManufacturer
import chapter01.Student

fun main(args: Array<String>) {
    var a1 = 10
    var a2 = -a1
    println("a2 : ${a2}")

    a2 = a1.unaryMinus()
    println("a2 : ${a2}")

    a2 = +a1
    println("a2 : ${a2}")

    a2 = a1.unaryPlus()
    println("a2 : ${a2}")

    var a3 = true
    var a4 = !a3
    println("a4 : ${a4}")

    a4 = a3.not()
    println("a4 : ${a4}")
}
