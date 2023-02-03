package com.vm.codingskillapplication.leetcod

fun main(args : Array<String>){
    //Longest Substring Without Repeating Characters
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/

    /*Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.*/

    val input ="abcabcbb"
    solution(input)
}

fun solution2(input : String){
    val s = input
    val n = s.length
    var leftIndex =0
    var rightIndex =0
    var lengthOutput=0
    var charMap= mutableMapOf<Char,Int>()
    while (rightIndex<n){

    }
    System.out.println("----"+lengthOutput)
}


fun solution(input : String){
    val s = input
    val n = s.length
    var leftIndex =0
    var rightIndex =0
    var lengthOutput=0
    var stringSet= mutableSetOf<Any>()
    while (rightIndex<n){
        if (stringSet.contains(s.get(rightIndex))){
            stringSet.remove(s.get(leftIndex))
            leftIndex++
            lengthOutput = Math.max(rightIndex-leftIndex+1,lengthOutput)
        }else{
            lengthOutput = Math.max(rightIndex-leftIndex+1,lengthOutput)
            stringSet.add(s.get(rightIndex))
            rightIndex++
        }
    }
    System.out.println("----"+lengthOutput)
}
























