package com.vm.codingskillapplication.daalgo
fun main(args :Array<String>){
  //31. Print a Fibonacci series using recursion?
    //Array declaration example
    //https://www.techiedelight.com/declare-initialize-array-kotlin/
    //val n = 10
    //var output = fibonacci(10)
    //println(output)
    fibonacciForLoop(20)
}

fun fibonacci(n: Int): Int {
    return if (n<=1) n else fibonacci(n-1) + fibonacci( n-2)
}


fun fibonacciForLoop(n: Int) {
   var arr= Array<Int>(n+1){1}
    arr[0] =0
    arr[1] =1

    for (i in 2..arr.size-1){
        arr[i] = arr[i-1]+ arr[i-2]
    }

    arr.forEach { println(it) }
}



