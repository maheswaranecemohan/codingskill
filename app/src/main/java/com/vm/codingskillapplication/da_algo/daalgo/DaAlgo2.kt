package com.vm.codingskillapplication.da_algo.daalgo

fun main(args: Array<String>) {

    //How do you determine if a string is a palindrome?

    var str = "Maheswaran"
    var reverse = ""

    for (element in str) {
        reverse = element + reverse
    }

    if (str.equals(reverse)) {
        System.out.println("palindrome")
        System.out.println(str + "\n" + reverse)
    } else {
        System.out.println("Not a palindrome")
        System.out.println(str + "\n" + reverse)
    }
}