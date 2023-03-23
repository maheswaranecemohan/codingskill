package com.vm.codingskillapplication

import com.vm.codingskillapplication.da_algo.interview.Voda.simpleCalculation
import com.vm.codingskillapplication.da_algo.interview.tesco.*
import com.vm.codingskillapplication.da_algo.interview.tesco.CardFindingSystem
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CardFindingSystem {
    @Before
    fun setupBefor(){

    }

    @Test
    fun addTwoNumbers(){
        assertEquals(10,simpleCalculation(5,5))
        assert(10==10)
    }
    @Test
    fun testRoyalFlush(){
      val cardSystemType =  CardFindingSystem(listOf(
            Card(CardTypes.Heart, CardNumber.AAAA),
            Card(CardTypes.Heart, CardNumber.KKKK),
            Card(CardTypes.Heart, CardNumber.QQQQ),
            Card(CardTypes.Heart, CardNumber.Ten),
            Card(CardTypes.Heart, CardNumber.JJJJ),
        )).findCardSystemType()

        assert(OutputType.RoyalFlush==cardSystemType)

    }
    @After
    fun shutdownAfter(){

    }
}