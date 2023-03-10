package com.vm.codingskillapplication.da_algo.leetcod.ds.ds1.day2

import java.util.*

fun main(args : Array<String>){
    //https://www.youtube.com/watch?v=P1Ic85RarKY
    //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //Output: [1,2,2,3,5,6]
    //Explanation: The arrays we are merging are [1,2,3] and [2,5,6].

    var nums1 = intArrayOf(1,2,3,0,0,0)
    val nums2 = intArrayOf(2,5,6)
    val m = 3
    val n = 3
    merge(nums1,m,nums2,n)
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var i = m - 1
    var j = n - 1
    var k = m + n -1
    while (j >= 0) {
        nums1[k--] = if (i < 0 || nums1[i] < nums2[j]) nums2[j--] else nums1[i--]
    }
}

