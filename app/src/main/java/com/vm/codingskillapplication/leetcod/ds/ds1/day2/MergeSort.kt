package com.vm.codingskillapplication.leetcod.ds.ds1.day2

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
   // merge(nums1,m,nums2,n)


}

fun merge(nums11: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    /*  nums1 last index*/
    var mm = m
    var nn = n
    var nums1 = nums11
    var last =0
    if(m!=n){
         last = mm+nn-1
    }

    while (nn>0 &&mm>0){
        if (nums1[nn-1]>nums2[mm-1]){
            nums1[last] =nums1[nn-1]
            nn-=1
        }else{
            nums1[last] =nums2[mm-1]
            mm-=1
        }
        last-=1
    }

    /*while (mm>0){
        nums1[last] =nums2[mm-1]
        last-=1
        mm-=1
    }*/

    System.out.println(nums1.contentToString())
}

