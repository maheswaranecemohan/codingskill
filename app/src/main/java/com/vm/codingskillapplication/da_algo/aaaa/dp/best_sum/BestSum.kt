package com.vm.codingskillapplication.da_algo.aaaa.dp.best_sum
fun main (args : Array<String>){
    //println( bestSum(7, arrayOf(2,3), mutableMapOf())?.joinToString())
    println(bestSum(7, arrayOf(5,3,4,7), mutableMapOf())?.joinToString())
}

fun bestSum(targetSum: Int, numbers: Array<Int>, memoMapOf: MutableMap<Int, Array<Int>?>): Array<Int>? {
    if (memoMapOf.containsKey(targetSum)) return memoMapOf[targetSum]
    if (targetSum==0) return emptyArray()
    if(targetSum<0) return null
    var shortestCombination :Array<Int>? =null
    for (value in numbers){
       val remainder = targetSum-value
       val output =bestSum(remainder, numbers, mutableMapOf())
        output?.let {
            val output = output.plus(value)
            memoMapOf[targetSum]=output
            if (shortestCombination==null || shortestCombination!!.size>output.size) {
                shortestCombination=output
            }
        }
    }
    memoMapOf[targetSum]=null
    return shortestCombination
}
