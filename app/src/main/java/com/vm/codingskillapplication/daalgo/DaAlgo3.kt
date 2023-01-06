package com.vm.codingskillapplication.daalgo

fun main(args : Array<String>){
    //Find the number of occurrences of a character in a String?

    var str = "Maheswaran"
    var find = "a"
    var count =0
    for (i in str){
        if (i.toString().equals(find)){
            count++
        }
    }
    System.out.println("------->"+count)
}