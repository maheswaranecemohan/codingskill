package com.vm.codingskillapplication.da_algo.leetcod.algo.Day1

//https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i

fun main(args: Array<String>) {
    //Input: nums = [-1,0,3,5,9,12], target = 9

    val nums = arrayOf(-1, 0, 3, 5, 9, 12)
    val target = 9
    var indexOutput = -1

   for ((index, value) in nums.withIndex()) {
                if (value==target)
                {
                    indexOutput=index
                    break
                }
    }
    System.out.println("--------->"+indexOutput)
}