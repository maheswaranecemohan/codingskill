package com.vm.codingskillapplication.daalgo
fun main(args :Array<String>){
//How to find out if the given two strings are anagrams or not?


    var str1 = "asdfghjkl"
    var str2 ="lkjhgfdsa"

    var array1 =str1.toCharArray()
    var value = array1[0]
    value.let {

    }

    var strCharArray1 = arrayOf(str1).sort()
    var strCharArray2 = arrayOf(str2).sort()
    System.out.println( strCharArray1.equals(strCharArray2))
}