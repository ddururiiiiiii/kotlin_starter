package org.example.starter

class Lec06 {
}


fun main(){

    val numbers = listOf(1L, 2L, 3L)
    for ( number in numbers){
        println(number)
    }
}

fun test1(){
    for ( i in 1..3){
        println("zzz")
    }
    for ( i in 3 downTo 1){
        println("ggg")
    }
    for (i in 1..4 step 2){
        println("gggggg")
    }
}