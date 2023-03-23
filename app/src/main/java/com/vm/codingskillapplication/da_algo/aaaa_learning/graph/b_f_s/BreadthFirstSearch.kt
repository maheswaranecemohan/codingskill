package com.vm.codingskillapplication.da_algo.aaaa_learning.graph.b_f_s

fun main (args : Array<String>){
    val graph= mutableMapOf(
        "a" to arrayOf("c","b"),
        "b" to arrayOf("d"),
        "c" to arrayOf("e"),
        "d" to arrayOf("f"),
        "e" to arrayOf(),
        "f" to arrayOf()
    )
    breadthFirstSearch("a", graph)
}

fun breadthFirstSearch(source: String, graph: MutableMap<String, Array<String>>) {
    var deQue =ArrayDeque<String>()
    deQue.addFirst(source)
    while (!deQue.isEmpty()){
        val currentVal = deQue.removeLast()
        println(currentVal)
    for (value in graph.get(currentVal)!!){
        deQue.addFirst(value)
    }
    }
}

