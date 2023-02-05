package com.vm.codingskillapplication.leetcod.ds.ds1.day2

import java.util.*

fun main (array: Array<String>){
    //https://leetcode.com/problems/two-sum/description/?envType=study-plan&id=data-structure-i
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]

    //nums: IntArray, target: Int
    //IntArray
    var nums = intArrayOf(2,7,11,15)
    val target = 9
    val output = returnindexArray1(nums,target)
    System.out.println(Arrays.toString(output))
}

fun returnindexArray1(nums :IntArray,target :Int ):IntArray{
    val mutableMap = mutableMapOf<Int,Int>()
    for ((indexA, value1) in nums.withIndex()){
        if(mutableMap.containsKey(value1)){
           val index1 = mutableMap[value1]
            return intArrayOf(index1!!,indexA)
        }else{
            val value2 = target-value1
            mutableMap[value2] = indexA
        }
    }
    return intArrayOf()
}


fun returnindexArray(nums :IntArray,target :Int ):IntArray{
    twosum@for ((indexA, value1) in nums.withIndex()){
        for (indexB in indexA+1 until nums.size){
            if (value1+nums[indexB]==target) {
                twosum@  return intArrayOf(indexA,indexB)
            }
        }
    }
    return intArrayOf()
}

