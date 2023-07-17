import chapter01.CarManufacturer
import chapter01.Student

fun main(args: Array<String>) {
    var a13 = 10
    var a14 = a13 == 10
    println("a14 : ${a14}")

    a14 = a13.equals(10)
    println("a14 : ${a14}")

    a14 = a13 != 10
    println("a14 : ${a14}")

    a14 = !a13.equals(10)
    println("a14 : ${a14}")
}
