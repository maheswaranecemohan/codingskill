package com.vm.codingskillapplication.aaaa_coding.solid.example

import java.math.BigDecimal
interface PaymentGateway {
    fun processPayment(amount : BigDecimal) :Boolean
}