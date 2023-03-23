package com.vm.codingskillapplication.da_algo.aaaa_learning.graph.problem.undirectedpath

fun main(args : Array<String>){
    //Min 55
    var undirectedGraph = mutableListOf<Array<String>>(
        arrayOf("i","j"),
        arrayOf("k","i"),
        arrayOf("m","k"),
        arrayOf("k","l"),
        arrayOf("o","n")
    )
    println(buildGraph(undirectedGraph))
    println(hasPath("j","m",buildGraph(undirectedGraph), mutableSetOf()))
}

fun hasPath(
    source: String,
    destination: String,
    buildGraph: MutableMap<String, MutableList<String>>,
    visited: MutableSet<String>
):Boolean {
    if (source==destination) return true
    if (visited.contains(source)) return false
    visited.add(source)
    for (value in buildGraph[source]!!){
       if(hasPath(value,destination,buildGraph,visited)) return true
    }
    return false
}
fun buildGraph(undirectedGraph: MutableList<Array<String>>): MutableMap<String,MutableList<String>> {
    val graph = mutableMapOf<String, MutableList<String>>()
    for (value in undirectedGraph){
        val A = value.get(0)
        val B = value.get(1)
        if (!graph.containsKey(A)) graph[A]= mutableListOf()
        if (!graph.containsKey(B)) graph[B]= mutableListOf()
        graph[A]?.add(B)
        graph[B]?.add(A)
    }
return graph
}
