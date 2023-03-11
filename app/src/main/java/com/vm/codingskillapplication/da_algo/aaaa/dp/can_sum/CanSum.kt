package com.vm.codingskillapplication.da_algo.aaaa.dp.can_sum

fun main(args : Array<String>){
    println(canSum(7, arrayOf(2, 3), mutableMapOf<Int, Boolean>()))
    println(canSum(7, arrayOf(5, 3, 4, 7), mutableMapOf<Int, Boolean>()))
    println(canSum(7, arrayOf(2, 4), mutableMapOf<Int, Boolean>()))
    println(canSum(300, arrayOf(7,14), mutableMapOf<Int,Boolean>()))
}

fun canSum(targetNumber: Int, numbers: Array<Int>, memoMapOf: MutableMap<Int, Boolean>,):Boolean {
    if (memoMapOf[targetNumber]==true) return memoMapOf[targetNumber]!!
    if (targetNumber==0) return true
    if (targetNumber<0) return false
    for (value in numbers){
        val remainder =targetNumber-value
        if(canSum(remainder, numbers,memoMapOf)){
            memoMapOf[targetNumber]=true
            return true
        }
    }
    memoMapOf[targetNumber]=false
    return false
}
