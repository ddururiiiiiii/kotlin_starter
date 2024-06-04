package org.example.starter

class Lec02 {

}


fun startsWithA1(str: String?): Boolean{
    if (str == null){
        throw IllegalArgumentException("null 이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startWithA2(str: String?): Boolean?{
    if(str == null){
        return null;
    }
    return str.startsWith("A");
}

fun startsWithA3(str: String?): Boolean?{
    if (str == null){
        return false;
    }
    return str.startsWith("A");
}

fun test(){
    val str: String? = "ABC"
    str?.length
    //str.length //불가능

    val str2: String? = "A"
    str?.length ?: 0

    val number1: Int = 4
    var number2: Long = number1.toLong()
}


