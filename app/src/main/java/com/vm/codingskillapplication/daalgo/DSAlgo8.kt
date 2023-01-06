package com.vm.codingskillapplication.daalgo
fun main(args :Array<String>){
//https://www.youtube.com/watch?v=nKzEJWbkPbQ
//How would you implement the insertion sort algorithm?
    //Split into 2 sorted part and unsorted part
    //compare sorted and unsorted
    //Loop plus condition use while loop

    var arrayInt = arrayOf(2,5,8,2,4)

    for (i in 1..arrayInt.size-1) {
        var current = arrayInt[i]
        var j = i-1

        while (j>=0&&arrayInt[j]>current){
        arrayInt[j+1] = arrayInt[j]
            j--
        }

    }
    arrayInt.forEach {
        System.out.println(it)
    }
}