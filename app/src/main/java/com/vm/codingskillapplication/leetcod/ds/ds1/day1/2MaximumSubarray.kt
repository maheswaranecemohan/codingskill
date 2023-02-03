package com.vm.codingskillapplication.leetcod.ds.ds1

fun main (args : Array<String>){

    //https://leetcode.com/problems/maximum-subarray/?envType=study-plan&id=data-structure-i
    //Given an integer array nums, find the subarray with the largest sum, and return its sum

    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    val nums = intArrayOf(-2,1)
    var largestSum = nums[0]
    for ((indexA, value) in nums.withIndex()){
        largestSum =Math.max(value,largestSum)
        var subTotal = value
        for (indexB in indexA+1 until nums.size ){
                subTotal =subTotal+nums[indexB]
                largestSum =Math.max(subTotal,largestSum)
        }
    }
    System.out.println(largestSum)
}