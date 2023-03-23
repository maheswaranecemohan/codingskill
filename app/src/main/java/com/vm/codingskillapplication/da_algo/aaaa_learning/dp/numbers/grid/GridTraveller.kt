package com.vm.codingskillapplication.da_algo.aaaa_learning.dp.numbers.grid

fun main (args : Array<String>){
    println(gridTraveller(18,18, mutableMapOf()))
}

fun gridTraveller(m: Int, n: Int, memoMapOf: MutableMap<String, Long>):Long {
    var key =m.toString()+","+n
    if (memoMapOf.containsKey(key)) return memoMapOf[key]!!
    if (m==1 && n==1) return 1
    if(m==0 || n==0) return 0
    memoMapOf[key] = gridTraveller(m-1,n,memoMapOf) + gridTraveller(m,n-1,memoMapOf)
    return memoMapOf[key]!!
}


