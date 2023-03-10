package com.vm.codingskillapplication.da_algo.daalgo
fun main(args :Array<String>){
//29. How do you reverse an array? without extra memory space
//https://www.youtube.com/watch?v=W-090WziKAs
    var arrayInt = arrayOf(2,5,8,4,4)
    var firstIndex = 0
    var lastIndex =arrayInt.size-1
   while (firstIndex<lastIndex){
    var temp = arrayInt[lastIndex]
        arrayInt[lastIndex] =arrayInt[firstIndex]
        arrayInt[firstIndex]=temp
        firstIndex++
        lastIndex--
    }
    arrayInt.forEach {
        System.out.println(it)
    }
}