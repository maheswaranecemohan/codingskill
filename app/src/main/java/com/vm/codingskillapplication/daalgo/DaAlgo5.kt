package com.vm.codingskillapplication.daalgo

fun main (args : Array<String>){
    //How do you calculate the number of vowels and consonants in a String?

    var str ="Maheswaran"
    var vowels =0
    var consonants=0
    for (i in str){
        if (i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
            vowels++
        }else{
            consonants++
        }
    }
    System.out.println(vowels)
    System.out.println(consonants)
}