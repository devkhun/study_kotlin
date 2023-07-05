import chapter01.CarManufacturer
import chapter01.Student

fun main(args: Array<String>) {
    f1(a1 = {
        println("f1이 전달한 함수가 호출되었습니다")
    })

    f2(a1 = {x: Int, y: Int ->
        println("f2가 전달한 함수가 호출되엇습니다")
        println("x : ${x}")
        println("y : ${y}")
    })

    f3(a1 = {x: Int, y: Int ->
        x + y // 제일 마지막에 작성한 값이 return
    })

    f3(a1 = {x: Int, y: Int ->
        x - y
    })
}

fun f1(a1 : () -> Unit) {
    // a1은 매개변수로 넘어온 함수
    // () : a1의 매개변수
    // -> Unit : 반환타입
    // a1 : 매개변수, 반환타입이 없는 함수

    a1()
}

fun f2(a1 : (Int, Int) -> Unit) {
    // a1은 매개변수가 2개인 함수
    a1(100, 100)
}

fun f3(a1 : (Int, Int) -> Int) {
    var a2 = a1(100, 200)
    println("a2 : ${a2}")
}