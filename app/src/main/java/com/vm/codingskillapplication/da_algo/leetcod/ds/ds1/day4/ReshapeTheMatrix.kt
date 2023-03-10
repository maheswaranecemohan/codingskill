package com.vm.codingskillapplication.da_algo.leetcod.ds.ds1.day4

fun main (args : Array<String>){

    //https://www.youtube.com/watch?v=a496Nw8VQeM
    //Input: mat = [[1,2],[3,4]], r = 1, c = 4
    //Output: [[1,2,3,4]]

    val intarray1 = intArrayOf(1,2)
    val intarray2 = intArrayOf(3,4)
    var mat: Array<IntArray> = arrayOf(intarray1,intarray2)
    var r = 1
    var c = 4
    reshapeTheMatrix(mat,r,c)
}

fun reshapeTheMatrix(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    if (r*c !=mat.size*mat[0].size || (r ==mat.size && c ==mat[0].size)) {
        return mat
    }
    var resultMatrix = Array(r) { IntArray(c) {0}}
    for (index in 0 until 4){
        resultMatrix[index/c][index%c] = mat[index/mat[0].size][index%mat[0].size]
    }
    return resultMatrix
}
