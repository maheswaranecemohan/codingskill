package com.vm.codingskillapplication.da_algo.daalgo
fun main(string: Array<String>){
//https://www.simplilearn.com/coding-interview-questions-article

// How do you reverse a string in Java?
    var str : String?=null
    str = "Maheswaran"
    val unitTest ="narawsehaM"
    var reverse =""
    for (i in 0..str.length-1) {
        reverse=str[i]+reverse
    }

    println(reverse)
    println(reverse.equals(unitTest))
}