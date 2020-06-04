package kr.hnu.ock.kotlin_0604

fun main() {
    //변수의 종류 val, var
    val hello1 = "Hello World1" //final (변수의 선언과 동시에 초기화 해준다면 자료형을 입력하지 않아도 자동으로 변수의 자료형이 결정됨)
    var hello2: String = "Hello World2"//int, String, float, double (자바 ->  String hello2 = "";)
    var hello3: String? = "world2"
    //물음표(?)를 변수의 자료형 뒤에 붙일 경우, 변수에 null이 들어갈 수 있음
    //?가 없을 경우, 변수에 null이 들어갈 수 없음

    println(hello1)
    println(hello1)

    println(hello())

    hello()
}

fun hello(): String{
    //kotlin void fun -> fun hello(){}, java void fun -> private void hello(){}
    //kotlin String fun -> fun hello() : String{}, java String fun -> private String hello(){}
    //hello는 문자열을 반환해주는 함수

    return "hello fun!"
}