package com.vm.codingskillapplication

import com.vm.codingskillapplication.aaaa_coding.solid.example.OrderProduct
import com.vm.codingskillapplication.aaaa_coding.solid.example.PayPalPayment
import com.vm.codingskillapplication.aaaa_coding.solid.example.WorldPayPayment
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.*
import java.math.BigDecimal

class PaymentGatewayTest {
    @Test
    fun testWorldpayPayment(){
        val worldPayPayment =WorldPayPayment()
        val orderProdcut = OrderProduct(BigDecimal(100),worldPayPayment)
        assertEquals(false,orderProdcut.payNow())
    }

    @Test
    fun testPaypal(){
        val payPalPayment = PayPalPayment()
        val orederProduct = OrderProduct(BigDecimal(200),payPalPayment)
        assertEquals(true,orederProduct.payNow())
    }

    @Test
    fun testWordPayPaymentWithMock(){
        val worldPayPayment = mock(WorldPayPayment::class.java)
        `when`(worldPayPayment.processPayment(BigDecimal(100))).thenReturn(false)

        val orderProduct =OrderProduct(BigDecimal(100),worldPayPayment)
        assertEquals(false,orderProduct.payNow())

        verify(worldPayPayment, times(1)).processPayment(BigDecimal(100))
    }
}