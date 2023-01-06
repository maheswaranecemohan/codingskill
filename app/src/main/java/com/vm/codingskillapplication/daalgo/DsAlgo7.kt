package com.vm.codingskillapplication.daalgo
fun main(args :Array<String>){
//How would you implement the bubble sort algorithm?
 //Each iteration start of the array or end of the array will be sorted
 //compare 2 index, outerloop -1 and inner -2 +outerloop index


    var intArray = intArrayOf(3,9,7,5,4,3,2,1,1,1,2,2,3)
    var temp :Int?
    for (i in 0..intArray.size-1) {
        for (j in 0..intArray.size-i-2) {
            if (intArray[j] > intArray[j + 1]) {
                temp = intArray[j]
                intArray[j] = intArray[j+1]
                intArray[j+1] =temp
            }
        }
    }

    intArray.forEach {
        System.out.println(it)
    }
}