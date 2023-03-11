package com.vm.codingskillapplication.da_algo.aaaa.dp.how_sum

fun main (args : Array<String>){
    //Total how many Sum
    println(howSum(7, listOf(2, 3))?.joinToString())
   // println(howSum(7, listOf(5, 3, 4, 7))?.joinToString())
    //println(howSum(7, listOf(2, 4))?.joinToString())
   // println(howSum(300, listOf(7,14))?.joinToString())
}

fun howSum(targetSum: Int, numberList: List<Int>): List<Int>? {
    if (targetSum==0) return emptyList()
    if(targetSum<0) return null
    for (value in numberList){
    val remainder = targetSum-value
       val output = howSum(remainder,numberList)
        output?.let {
            return output.plus(targetSum)
        }
    }
return null
}
