import chapter01.CarManufacturer
import chapter01.Student

fun main(args: Array<String>) {
    var a5 = 10
    var a6 = 3
    var a7 = a5 + a6
    var a8 = a5.plus(a6)
    println("a7 : ${a7}")
    println("a8 : ${a8}")

    a7 = a5 - a6
    a8 = a5.minus(a6)
    println("a7 : ${a7}")
    println("a8 : ${a8}")

    a7 = a5 * a6
    a8 = a5.times(a6)
    println("a7 : ${a7}")
    println("a8 : ${a8}")

    a7 = a5 / a6
    a8 = a5.div(a6)
    println("a7 : ${a7}")
    println("a8 : ${a8}")

    a7 = a5 % a6
    a8 = a5.rem(a6)
    println("a7 : ${a7}")
    println("a8 : ${a8}")

    var a10 = a6..a5
    var a11 = a6.rangeTo(a5)
    println("a10 : ${a10}")
    println("a11 : ${a11}")
}
