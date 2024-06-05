package org.example.starter

class Lec05 {
}

fun test1(score: Int){

    if (score > 0){
        throw IllegalArgumentException("${score}0보다 클수 없어.");
    }
}
fun test2(score: Int) : String {
    if (score > 60){
        return "P"
    } else {
        return "a"
    }
}

fun test3(score: Int): String {
    return if (score > 50){
        "A"
    } else {
        "B"
    }
}

fun test4(score : Int): String {
    return if (score in 1..10){
        "P"
    } else{
        "a"
    }
}

fun test5(score : Int) : String {
    return when (score){
        in 1..10 -> "a"
        2, 3 -> "b"
        else -> "gg"
    }
}
fun test6(obj : Any) : Boolean {
    return when (obj){
        is String -> obj.startsWith("a")
        else -> false
    }
}

fun test7 (number : Int) {
    when{
        number == 0 -> println("??")
    }
}
