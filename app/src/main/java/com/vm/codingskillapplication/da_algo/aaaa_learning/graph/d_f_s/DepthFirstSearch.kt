package com.vm.codingskillapplication.da_algo.aaaa_learning.graph.d_f_s
import java.util.Stack
fun main (args : Array<String>){
   val graph= mutableMapOf(
       "a" to arrayOf("b","c"),
        "b" to arrayOf("d"),
        "c" to arrayOf("e"),
        "d" to arrayOf("f"),
        "e" to arrayOf(),
        "f" to arrayOf()
    )
    //depthFirstPrint("a", graph)
    //depthFirsStack("a", graph)
    println(hasPath1("a","d",graph))
}

fun hasPath1(start: String, end: String, graph: MutableMap<String, Array<String>>): Boolean {
    if (start==end) return true
    for (value in graph[start]!!){
        if(hasPath1(value,end,graph)){
            return true
        }
    }
    return false
}


// D F S Stack
fun depthFirsStack(source: String, graph: MutableMap<String, Array<String>>) {
    var stackMemo =Stack<String>()
    stackMemo.push(source)
    while (!stackMemo.empty()){
        var currentVal = stackMemo.pop()
        println(currentVal)
        for (value in graph[currentVal]!!){
            stackMemo.push(value)
        }
    }
}

//DFS  Recurson
fun depthFirstPrint(source: String, graph: MutableMap<String, Array<String>>) {
    if (!graph.containsKey(source)) {
        return
    }
    println(source)
    for (value in graph[source]!!){
        depthFirstPrint(value, graph)
    }
}


