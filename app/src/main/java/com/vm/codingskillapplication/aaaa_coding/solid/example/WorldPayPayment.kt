package com.vm.codingskillapplication.aaaa_coding.solid.example

import java.math.BigDecimal

class WorldPayPayment : PaymentGateway {
    override fun processPayment(amount: BigDecimal): Boolean {
        return true
    }
}