package com.vm.codingskillapplication.leetcod.ds.ds1.day2
fun main(args : Array<String>){
    //https://www.youtube.com/watch?v=P1Ic85RarKY
    //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //Output: [1,2,2,3,5,6]
    //Explanation: The arrays we are merging are [1,2,3] and [2,5,6].

    var nums1 = intArrayOf(1,2,3,0,0,0)
    val nums2 = intArrayOf(2,5,6)
    val m = 3
    val n = 3
   // merge(nums1,m,nums2,n)

    test2()
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

}

fun test (){
    val startPosition = "2b"
    val R = 3
    val C = 2

    var row = Character.getNumericValue(startPosition[0]) + R
    var column = startPosition[1].toInt() + C

    if (row > 8) {
        row %= 8
    }
    if (row == 0) {
        row = 8
    }

    if (column > 104) {
        column = (column - 96) % 8
    }
    if (column < 97) {
        column = 97 + (column - 97) % 8
    }

    val newPosition = Integer.toString(row) + column.toChar()

    println("The new position is: $newPosition")
}

fun test2(){
    val startPosition = "2b"
    val R = 3
    val C = 2

    var row = Character.getNumericValue(startPosition[0])
    var column = startPosition[1]

    row = (row + R - 1) % 8 + 1
    column = (((column - 'a' + C) % 8 + 8) % 8 + 'a'.toInt()).toChar()

    val newPosition = row.toString() + "" + column

    println("The new position is: $newPosition")
}