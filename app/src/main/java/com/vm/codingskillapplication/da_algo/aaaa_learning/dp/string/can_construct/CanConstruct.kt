package com.vm.codingskillapplication.da_algo.aaaa_learning.dp.string.can_construct

fun main (args : Array<String>){
    println( canConstructStr("abcdef", arrayOf("ab","abc","cd","def","abcd"), mutableMapOf()))
    println( canConstructStr("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", arrayOf("e","ee","eee","eeee","eeeee"), mutableMapOf()))
    //println( "Test")
}

fun canConstructStr(targe: String, wrordBank: Array<String>, memoMapOf: MutableMap<String, Boolean>) :Boolean?{
    if (memoMapOf.containsKey(targe)) return memoMapOf[targe]
    if (targe.equals("")) return true
    for (value in wrordBank){
        if (targe.indexOf(value)==0){
           val remainingStr = targe.substring(value.length)
            if (canConstructStr(remainingStr, wrordBank, memoMapOf) == true){
                memoMapOf[targe]=true
                return true
            }
        }
        memoMapOf[targe]=false
    }

    return false
}
