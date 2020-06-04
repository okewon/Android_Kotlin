package kr.hnu.ock.kotlin_0604

fun main(){
    //1.배열
    //2.loop 반복
    //3. 캐스팅
    

    //1.배열 = {"", "", ""}
    var arr1 = listOf("1", "2") //수정 불가능
    //Java ArrayList <= 수정 가능
    var arr2 = mutableListOf("1", "2") //수정 가능

    //arr1.add("4") 불가능
    arr2.add("3") //가능

    //2. 반복문
    //for (int i = 0; i < arr.size; i++){} 이러한 반복문이 아닌 java의 향상된 반복문 형태로만 사용 가능
    for(item in arr1){
        println(item)
    }
    for((index, item) in arr2.withIndex()){
        println("$index $item")
    }

    //3.casting object<String, int, long, ... // Any
    //Any -> auto casting 지원
    //(String) hello 해줄 필요 없음
    var hello : Any = "hello"
    if(hello is String){
        var str : String = hello
    }
}