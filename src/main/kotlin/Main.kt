import chapter01.CarManufacturer
import chapter01.Student

fun main(args: Array<String>) {
    f1()
    f2(100, 55.55)
    f3(100, 55.55)
    f3(100) // 초기값을 지정해 줬기 때문에 문제 없음
    f3(a1 = 200, a2 = 66.66) // 매개변수에 직접 값을 넣어서 호출도 가능
    f3(a2 = 77.77, a1 = 300) // 매개변수에 직접 값을 넣는 경우 매개변수 순서 바꾸는 것도 가능
    f3(a2 = 88.88) // 매개변수 한개만 넣어도 호출 가능

    f4()
    var a1 = f5()
    println("a1 : ${a1}")

    f6()
    f6(100)
    f6(55.55)
    f6(100, 200)

    f7()
    // f8() // 오류발생! f8은 f7내에서 선언된 함수이기 때문에 f7내에서만 호출 가능
}

fun f1() { // 첫글자가 숫자만 아니면 됨!
    println("f1 함수가 호출되었습니다")
}

fun f2(a1: Int, a2: Double) { // 매개변수가 있는 함수
    println("f2 함수가 호출되었습니다")
    println("a1: ${a1}")
    println("a2: ${a2}")
}

fun f3(a1: Int = 0, a2: Double = 0.0) { // 초기값을 지정할 수 있다
    println("f3 함수가 호출되었습니다")
    println("a1: ${a1}")
    println("a2: ${a2}")
}

fun f4() : Unit { // 반환이 없는 경우 Unit을 사용
    println("f4 함수가 호출되었습니다")
}

fun f5() : Int { // 반환타입이 Int형
    return 100
}

// 오버로딩 가능
// 매개변수 갯수, 타입이 다르면 동일한 함수명으로 정의 가능
fun f6() {
    println("매개 변수가 없는 f6")
}

fun f6(a1: Int) {
    println("정수 값 한개를 받는 f6: ${a1}")
}

fun f6(a1: Double) {
    println("실수 값 한개를 받는 f6: ${a1}")
}

fun f6(a1: Int, a2: Int) {
    println("정수 값 두개를 받는 f6: ${a1}, ${a2}")
}

// 함수 안에 함수
fun f7() {
    fun f8() { // f8은 f7안에서만 호출 가능
        println("f8 함수가 호출되었습니다")
    }

    println("f7 함수가 호출되었습니다")
    f8()
}