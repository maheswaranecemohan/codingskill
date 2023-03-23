package com.vm.codingskillapplication.da_algo.aaaa_learning.graph.problem.problem1

import java.util.Stack

fun main(args : Array<String>){
    val graph = mutableMapOf(
        "a" to arrayOf("c","b"),
        "b" to arrayOf("d"),
        "c" to arrayOf("e"),
        "d" to arrayOf("f"),
        "e" to arrayOf(),
        "f" to arrayOf()
    )
     println(hasPathRecurson("a","f",graph))
    //println(hasPathDFS("a","f",graph))
    //println(hasPathBFS("a","f",graph))
}



//Recurson
fun hasPathRecurson(start: String, end: String, graph: MutableMap<String, Array<String>>):Boolean {
    if (start==end) return true
    for (value in graph[start]!!){
        if(hasPathRecurson(value,end,graph)) return true
    }
    return false
}


fun hasPathBFS(start: String, end: String, graph: MutableMap<String, Array<String>>): Boolean {
    val queue = ArrayDeque<String>()
    queue.addFirst(start)
    while (!queue.isEmpty()){
       val currentVal= queue.removeLast()
        if (currentVal==end) return true
        for (value in graph[currentVal]!!){
            queue.addFirst(value)
        }
    }
    return false
}
// B F S

//DFS
fun hasPathDFS(stat: String, end: String, graph: MutableMap<String, Array<String>>): Boolean {
    val stack = Stack<String>()
    stack.push(stat)
    while (!stack.empty()){
        val current =stack.pop()
        if (current==end) return true
        for (value in graph[current]!!){
            stack.push(value)
        }
    }
    return false
}


