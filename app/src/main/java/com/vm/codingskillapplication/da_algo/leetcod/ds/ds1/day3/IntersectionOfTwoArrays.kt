package com.vm.codingskillapplication.da_algo.leetcod.ds.ds1.day3

import java.util.*

fun main(arga : Array<String>){
    //Intersection of 2 arrays

    //Input: nums1 = [1,2,2,1], nums2 = [2,2]
    //Output: [2,2]
    val array1 = intArrayOf(1,2,2,1)
    val array2 = intArrayOf(2,2,2)
    val output = intersectionOfTwoArray(array1,array2)
    System.out.println(output.contentToString())

}

fun intersectionOfTwoArray(nums1 : IntArray,nums2: IntArray) :IntArray{
    val num1Size = nums1.size
    val num2Size = nums2.size
    var i = 0
    var j = 0
    var k =0
    nums1.sort()
    nums2.sort()
    while (i<num1Size && j<num2Size){
        if (nums1[i]<nums2[j]){
            i++
        }
        else if (nums1[i]>nums2[j]){
            j++
        }else{
            nums1[k++] =nums1[i++]
            j++
        }
    }

    return nums1.copyOfRange(0, k)
}
