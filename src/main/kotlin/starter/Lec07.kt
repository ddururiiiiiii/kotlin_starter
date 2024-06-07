package org.example.starter

class Lec07 {
}

fun test(str: String) : Int {
    try {
        return str.toInt()
    } catch(e : NumberFormatException){
        throw IllegalArgumentException("에러에유")
    }
}

fun test2(str : String) : Int?{
    return try {
        str.toInt()
    } catch (e: NumberFormatException){
        null
    }
}

