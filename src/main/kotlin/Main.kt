import chapter01.CarManufacturer
import chapter01.Student

fun main(args: Array<String>) {
    var a5 = 10
    var a6 = 10
    var a7 = a5++ // a5 = a5 + 1
    var a8 = a6-- // a6 = a6 - 1
    println("a5, a7 : ${a5}, ${a7}")
    println("a6, a8 : ${a6}, ${a8}")

    a5 = 10
    a6 = 10
    a7 = ++a5
    a8 = --a6
    println("a5, a7 : ${a5}, ${a7}")
    println("a6, a8 : ${a6}, ${a8}")

    a5 = 10
    a6 = 10
    a7 = a5.inc()
    a8 = a6.dec()
    println("a5, a7 : ${a5}, ${a7}")
    println("a6, a8 : ${a6}, ${a8}")
}
