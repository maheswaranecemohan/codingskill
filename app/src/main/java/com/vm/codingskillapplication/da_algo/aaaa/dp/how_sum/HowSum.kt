package com.vm.codingskillapplication.da_algo.aaaa.dp.how_sum
fun main (args : Array<String>){
   //Total how many Sum
   // println(howSum(7, listOf(2, 3), mutableMapOf())?.joinToString())
   // println(howSum(7, listOf(5, 3, 4, 7),mutableMapOf())?.joinToString())
   // println(howSum(7, listOf(2, 4),mutableMapOf())?.joinToString())
    println(howSum(300, listOf(7,14),mutableMapOf())?.joinToString())
}

fun howSum(targetSum: Int, numberList: List<Int>, memoMapOf: MutableMap<Int, Array<Int>?>): Array<Int>? {
    if (memoMapOf.containsKey(targetSum)) return memoMapOf[targetSum]
    if (targetSum==0) return emptyArray()
    if(targetSum<0) return null
    for (value in numberList){
    val remainder = targetSum-value
       val output = howSum(remainder, numberList,memoMapOf)
        output?.let {
            val finalOutPut = output.plus(value)
            memoMapOf[targetSum] = finalOutPut
            return finalOutPut
        }
    }
    memoMapOf[targetSum] = null
return null
}
