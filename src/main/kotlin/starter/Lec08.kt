package org.example.starter

class Lec08 {
}

fun test(a: Int, b: Int) =
    if (a > b){

    } else {

    }

fun test2(a: Int, b: Int) : Int = if (a > b) a else b

fun test3_(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num){
        if (useNewLine){
            println(str)
        } else {
            println(str)
        }
    }
}

fun test4{
    val array = arrayOf("a", "b", "c")
    //printAll(*array)
}
