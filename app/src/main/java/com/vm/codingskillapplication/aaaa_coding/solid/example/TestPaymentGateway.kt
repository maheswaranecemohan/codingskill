package com.vm.codingskillapplication.aaaa_coding.solid.example

import java.math.BigDecimal

fun main(args : Array<String>){
    val worldPayPayment = WorldPayPayment()
    val payPalPayment = PayPalPayment()

    val orderProduct =OrderProduct(BigDecimal(100),payPalPayment)
    println(orderProduct.payNow())
}