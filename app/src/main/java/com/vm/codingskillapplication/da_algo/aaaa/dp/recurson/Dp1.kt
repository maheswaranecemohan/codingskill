package com.vm.codingskillapplication.da_algo.aaaa.dp
// https://www.youtube.com/watch?v=oBt53YbR9Kk&t=6302s
fun main(args : Array<String>){
println(fibonachiSolution2(7,mutableMapOf<Int, Long>()))
    //println(foo(5))
}

fun fibonachiSolution2(n :Int, memoryMap :MutableMap<Int,Long>) :Long{
    if (memoryMap.containsKey(n)) return memoryMap[n]!!
    if (n<=2) return 1
    memoryMap[n]=fibonachiSolution2(n-1,memoryMap) + fibonachiSolution2(n-2,memoryMap)
    return  memoryMap[n]!!
}
fun foo(n: Int):Int {
    if (n<=1) return 1
    System.out.println(n)
    var output = foo(n-1)
    val output1 = output
    println("---->"+output1)
    return  output1
}


