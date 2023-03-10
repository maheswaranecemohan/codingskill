package com.vm.codingskillapplication.da_algo.leetcod.ds.ds1.day3

fun main (args : Array<String>){
    //121. Best Time to Buy and Sell Stock
    //Input: prices = [7,1,5,3,6,4]
    //Input: prices = [7,1,5,3,6,4]

    //Output: 5
    //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    var prices = intArrayOf(7,2,5,3,1,7)
    maxProfit1(prices)
}

fun maxProfit1(prices :IntArray){
    var profit = 0
    var buy =prices[0]
    for (value in prices){
     buy =Math.min(buy,value)
     profit =Math.max(profit,value-buy)
    }
    System.out.println(profit)
}

fun maxProfit(prices :IntArray){
    var output =0
    var i = 0
    var j =0
    while (j<prices.size){
        if (prices[i]>prices[j]){
            i=j
        }else if (prices[i]<prices[j]){
            output =Math.max(output, prices[j]-prices[i])
            j++
        }else{
            j++
        }
    }
    System.out.println(output)
}