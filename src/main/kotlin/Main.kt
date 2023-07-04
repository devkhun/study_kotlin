import chapter01.CarManufacturer
import chapter01.Student

fun main(args: Array<String>) {
    print("출력문")
    print("출력문2")
    println("출력문")
    println("출력문")

    println("숫자 ${100}")
    var a1 = 100
    var a2 = "안녕하세요"
    println("a1 : ${a1}, a2 : ${a2}")

    //println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")

    // 프로젝트에서 자바와 코틀린 혼용하기!
    val student = Student("geehhyy")
    //println("Student name:${student.name}")

    val carManufacturer = CarManufacturer("Hyundai")
    //println("Car manufacturer:${carManufacturer.name}")
}