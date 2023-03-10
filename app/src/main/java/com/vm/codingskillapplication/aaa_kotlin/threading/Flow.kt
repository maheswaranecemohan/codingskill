package com.vm.codingskillapplication.aaa_kotlin.threading
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
//https://amitshekhar.me/blog/flow-api-in-kotlin
 fun main (args :Array<String>){
     runBlocking(Dispatchers.IO) {
         //Runs on background Thread
         /*flowOf(1, 2, 3).flowOn(Dispatchers.Default).map { it*2 }.collect{
             println(it)l
         }*/

         val result = mutableListOf<Int>()
         (1..500).asFlow().flowOn(Dispatchers.Default)
             .filter {
                 it % 2 == 0
             }
             .toList(result)

         println(result.joinToString (separator = " "))
     }
}
