package com.vm.codingskillapplication.da_algo.leetcod.interview.tesco
fun main(args: Array<String>){
    var cardList :ArrayList<Card> = arrayListOf()
    cardList.add(Card(cardTypeHH,"A"))
    cardList.add(Card(cardTypeHH,"K"))
    cardList.add(Card(cardTypeHH,"Q"))
    cardList.add(Card(cardTypeHH,"J"))
    cardList.add(Card(cardTypeHH,"10"))
    var output = royalFlush(cardList)
    System.out.println(output)


    var cardList1 :ArrayList<Card> = arrayListOf()
    cardList1.add(Card(cardTypeHH,"A"))
    cardList1.add(Card(cardTypeHH,"K"))
    cardList1.add(Card(cardTypeHH,"Q"))
    cardList1.add(Card(cardTypeHH,"J"))
    cardList1.add(Card(cardTypeHH,"10"))
    var output1 = royalFlush(cardList)
    System.out.println(output1)

}

fun royalFlush(cardList: ArrayList<Card>):Boolean{
    var cardNumber = cardList.map { it.cardNumber }
    if (cardNumber== RoyalFlushString) {
        return true //"Royal Flush"
    }
    return false //"Not Royal Flush"
}

fun straightFlush(cardList: ArrayList<Card>):Boolean{
    var cardNumber = cardList.map { it.cardType }
    val cardTypeDistinct = cardNumber.distinct().count()


    if (cardTypeDistinct==1) {
        return true //"straightFlush"
    }
    return false //"Not straightFlush"
}
data class Person(val name: String, val mark: Int)
val RoyalFlushString :List<String> = listOf("A","K","Q","J","10")
data class Card(var cardType: String ="", var cardNumber: String ="")
const val cardTypeHH ="HH"
const val cardTypeDD ="DD"
const val cardTypeCC ="CC"
const val cardTypeSS ="SS"