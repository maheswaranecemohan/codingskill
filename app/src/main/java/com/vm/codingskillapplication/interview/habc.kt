package com.vm.codingskillapplication.interview

fun main (args :Array<String>){
    var intArray = intArrayOf(2,5,7,8)
    val target = 9
    var outPut = solution(intArray,target)
    outPut.forEach { System.out.println(it) }

}

fun solution(nums: IntArray, target: Int): Array<Int> {
    val outPutArray = Array(2) { it }
    for(i in 0..nums.size-1){
        for(j in 0..nums.size-1){
            if(nums[i]+nums[j]==target){
                outPutArray[0]=nums[i]
                outPutArray[1]=nums[j]
                return outPutArray
            }
        }
    }
    return outPutArray
}
