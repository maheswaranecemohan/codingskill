package com.vm.codingskillapplication.da_algo.daalgo
fun main(args :Array<String>){
  //How do you find the factorial of an integer?

    var output = factorial(5)
    System.out.println(output)
}

fun factorial(n: Long): Long {
return if (n==1L) 1L else n * factorial(n-1)
}






