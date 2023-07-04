import chapter01.CarManufacturer
import chapter01.Student

fun main(args: Array<String>) {
    var a1 = 100
    println("a1 : ${a1}")
    // a1 = 55.55 // 오류 발생! 최초에 정수를 넣었기 때문에 자료형은 정수형 -> 그 이후에 변경 불가능

    var a2 = "안녕하세요"
    println("a2 : ${a2}")

    var a3 : Int = 100
    println("a3 : ${a3}")

    // var a4 : String = 100 // 오류 발생! 문자열로 선언했는데 정수형을 넣었기 때문

    var a4 = 100
    println("a4 : ${a4}")
    a4 = 200
    println("a4 : ${a4}") // a4는 var로 선언되었기 때문에 값 변경이 가능

    val a5 = 100
    println("a5 : ${a5}")
    // a5 = 200 // 오류 발생! val로 선언했기 때문에 값 변경이 불가능


    println("정수 : ${100}")
    println("정수 (Long) : ${100L}")
    println("실수 : ${55.55}")
    println("실수 (Float) : ${55.55F}") // 메모리 기억공간을 절약할 수 있음

    // 세자리 마다 _ 추가 가능 (=콤마와 똑같은 기능)
    // 숫자의 가독성이 높아짐
    println(100000000)
    println(1_000_000_000)

    println("문자열입니다.") // 문자열
    println('a') // 문자




    /*print("출력문")
    print("출력문2")
    println("출력문")
    println("출력문")

    println("숫자 ${100}")
    var a1 = 100
    var a2 = "안녕하세요"
    println("a1 : ${a1}, a2 : ${a2}")*/

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