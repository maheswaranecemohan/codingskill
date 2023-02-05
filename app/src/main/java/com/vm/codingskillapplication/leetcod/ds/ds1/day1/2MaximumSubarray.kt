package com.vm.codingskillapplication.leetcod.ds.ds1.day1

fun main (args : Array<String>){

    //https://leetcode.com/problems/maximum-subarray/?envType=study-plan&id=data-structure-i
    //Given an integer array nums, find the subarray with the largest sum, and return its sum

    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
    System.out.println(maximumSum(nums))
}

fun maximumSum(nums : IntArray):Int{
    var max =nums[0]
    var currentSum=0
    for (value in nums) {
        if (currentSum < 0)
            currentSum = 0
        currentSum+=value
        max =Math.max(max,currentSum)
    }

    return max
}


fun maxSubArray2(nums: IntArray): Int {
    var max = nums[0]
    var currentSum =0
    for (value in nums){
        if (currentSum<0)
            currentSum=0
        currentSum+=value
        max = Math.max(max, currentSum)
    }
    return max
}

fun maxSubArray1(nums: IntArray): Int {
    var max = nums[0]
    var sum_at_point = nums[0]
    var sum_at_previous = nums[0]

    for (i in 1 until nums.size) {
        sum_at_point = Math.max(sum_at_previous + nums[i], nums[i])
        max = Math.max(sum_at_point, max)
        sum_at_previous = sum_at_point
    }
    return max
}

fun maxSubArray(nums: IntArray): Int {

    var largestSum = nums[0]
    for ((indexA, value) in nums.withIndex()){
        largestSum =Math.max(value,largestSum)
        var subTotal = value
        for (indexB in indexA+1 until nums.size ){
            subTotal =subTotal+nums[indexB]
            largestSum =Math.max(subTotal,largestSum)
        }
    }
    return largestSum
}