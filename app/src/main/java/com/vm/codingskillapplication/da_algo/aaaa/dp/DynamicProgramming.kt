package com.vm.codingskillapplication.da_algo.aaaa.dp
// https://www.youtube.com/watch?v=oBt53YbR9Kk&t=6302s
fun main(args : Array<String>){
//println(calculateFib(10,mutableMapOf<Int, Int>()))
    println(foo(5))
}

fun foo(n: Int):Int {
    if (n<=1) return 1
    System.out.println(n)
    var output = foo(n-1)
    val output1 = output
    println("---->"+output1)
    return  output1
}
//println(calculateFib(7))
/*fun calculateFib(n: Int, hashMaptest: MutableMap<Int, Int>) :Int{
    if (hashMaptest.containsKey(n)) {
        return hashMaptest[n]!!
    }
    if (n<=2 )  return 1
    val output = calculateFib(n-1,hashMaptest)+ calculateFib(n-2,hashMaptest)
    hashMaptest[n] =output
    return  output
}*/
