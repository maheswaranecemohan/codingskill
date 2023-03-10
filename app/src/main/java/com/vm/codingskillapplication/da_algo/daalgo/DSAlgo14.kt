package com.vm.codingskillapplication.da_algo.daalgo

fun main(args :Array<String>){
//How would you implement Binary Search?
    val arr = intArrayOf(1,2,3,4,5,6,7,8,9)
    val target = 99
    val ans = binarySearch(arr, target)
    println(ans)
}

fun binarySearch(arrays: IntArray, target: Int): Int {
    var start =0
    var end =arrays.size-1

    while (start <=end) {
        var mid = start + (end - start) / 2
        if (target < arrays[mid]){
            end = mid - 1
        }else if(target>arrays[mid]){
            start = mid + 1
        } else{
            return mid
        }
    }
    return -1
}






