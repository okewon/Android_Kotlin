package kr.hnu.ock.kotlin_0604

fun main(){
    //map - key, value pair JSON name! senti (value)
    //{"name" : "senti"}
    var map1 = mapOf(Pair("name", "senti")) //수정불가능
    var map2 = mutableMapOf<String, String>() //<> 안에 변수 자료형을 넣어야함 수정가능
    map2.put("name", "senti")
    map2.put("age", "1")

    for(map in map1){
        println(map)
    }

    println(map2.keys)

    for(map in map2){
        println(map.value)
    }

    //nullable or not null
}