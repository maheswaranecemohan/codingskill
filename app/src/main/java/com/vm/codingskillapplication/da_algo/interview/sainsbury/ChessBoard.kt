package com.vm.codingskillapplication.da_algo.interview.sainsbury
fun main(args : Array<String>){
    //Input
    //current position 2b
    //row 3
    //clm 2
    //Out put 5d

  /*  val input ="2b"
    val row =3
    val clm = 2*/

    val input ="5h"
    val row =11
    val clm = 25
    val finalRow = input.substring(0,1).toInt()+row
    val finalclm = (input.substring(1,2).single().code +clm).toChar()
    println(""+finalRow+" "+finalclm)
}