package kr.hnu.ock.kotlin_0604

fun main(){
    //class : 기능들(함수)의 집합체(객체)

    //1. class - 자동차(시동, 운전), 사람(밥 먹는다, 물 마신다, 걷는다), 동물(뛴다), 식물(자란다)
    //2. data class - set, get

    var cls = HelloClass()
    var cls2 = HelloClass(20)

    //java
    //HelloCalss cls = new HelloClass()

    println(cls2.age)

    var person = Person(1, "Ock")
    println(person.age)
}

class HelloClass{
    var age : Int = 0

    init { //java의 initialize

    }

    //def 생성자, 보조생성자
    constructor() //기본 생성자
    constructor(age : Int){
        this.age = age
    } //보조 생성자

}
data class Person(var age : Int, val name : String){

}