package com.vm.codingskillapplication.leetcod.ds.ds1
fun main(args : Array<String>){
//https://leetcode.com/problems/contains-duplicate/?envType=study-plan&id=data-structure-i
// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
    val intArray: IntArray = intArrayOf(1,2,3,4,1)
   var output= checkContainsDuplicate3(intArray)
   System.out.println("----> "+output)


}

fun checkContainsDuplicate3(nums :IntArray):Boolean {
    /*nums.forEachIndexed { index, i ->
    }*/

    return true
}

fun checkContainsDuplicate2(nums :IntArray):Boolean {
    if (nums.toMutableSet().size==nums.size){
        return false
    }
    return true
}

fun checkContainsDuplicate1(nums :IntArray):Boolean {
    val uniqueMap = mutableMapOf<Int,Boolean>()
    nums.forEach {
        uniqueMap[it]?.let {
        return true
        }
        uniqueMap[it] =true
    }
    return false
}

fun checkContainsDuplicate(nums :IntArray):Boolean {
    var numberList = mutableSetOf<Int>()
    nums.forEach {value->
        if (numberList.contains(value))  return true
            numberList.add(value)
    }
    return false
}
