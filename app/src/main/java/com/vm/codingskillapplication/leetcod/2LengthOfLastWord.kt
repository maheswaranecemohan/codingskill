package com.vm.codingskillapplication.leetcod

fun main(array: Array<String>){

    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //Input: s = "   fly me   to   the moon  "
    //Output: 4
    //Explanation: The last word is "moon" with length 4.

    val s = "moon  "
    var strTrim =s.trim()
    //var typeArray = strTrim.split("\\s+".toRegex()).toTypedArray()
    //System.out.println("-------->"+typeArray[typeArray.size-1].length)
    //System.out.println(s.length)
    var index=1
    var count=0
    var strLength = strTrim.length
    if (strLength>0 )
    {
        while (!strTrim[strTrim.length].equals(" ")){
            index++
            count++
        }
    }
    System.out.println(count)
}