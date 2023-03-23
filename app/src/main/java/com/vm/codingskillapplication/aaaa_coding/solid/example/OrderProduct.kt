package com.vm.codingskillapplication.aaaa_coding.solid.example
import java.math.BigDecimal
class OrderProduct(val amount : BigDecimal, val paymentGateway: PaymentGateway) {
    init {

    }
    fun payNow():Boolean{
        return paymentGateway.processPayment(amount)
    }
}