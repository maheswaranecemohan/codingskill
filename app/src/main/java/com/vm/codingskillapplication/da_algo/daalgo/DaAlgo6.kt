package com.vm.codingskillapplication.da_algo.daalgo
fun main(str :Array<String>){
//How do you get the matching elements in an integer array?

    var numberArray = arrayOf(2,8,4,2,2)



    for (i in 0..numberArray.size-2){
        for (j in i+1..numberArray.size-1){
            if(numberArray[i]==numberArray[j]){
                System.out.println(numberArray[i])
            }
        }
    }
}