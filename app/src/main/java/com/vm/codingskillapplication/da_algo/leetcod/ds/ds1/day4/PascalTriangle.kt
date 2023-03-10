package com.vm.codingskillapplication.da_algo.leetcod.ds.ds1.day4

//118. Pascal's Triangle

fun main(args : Array<String>){
    generate(5)
}

fun generate(numRows: Int): List<List<Int>> {
    val result : ArrayList<List<Int>> = arrayListOf()

    if (numRows==1){
        val innterList = arrayListOf<Int>()
         innterList[0] =1
        result.add(innterList)
        return  result
    }else if (numRows==2){
        val innterList = arrayListOf<Int>()
        innterList[0] =1
        innterList[1] =1
        result.add(innterList)
        return  result
    }
    for (value in 1..numRows){
        val innterList = arrayListOf<Int>()
        innterList.add(1)
        for (value1 in 1..value-1){
            innterList.add(value)
        }
        innterList.add(1)
        result.add(innterList)
    }
    return result
}