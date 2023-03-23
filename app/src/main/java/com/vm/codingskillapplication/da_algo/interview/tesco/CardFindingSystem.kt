package com.vm.codingskillapplication.da_algo.interview.tesco
fun main (args : Array<String>){
    /*CardFindingSystem(listOf(
        Card(CardTypes.Claver,CardNumber.Eight),
        Card(CardTypes.Claver,CardNumber.Nine),
        Card(CardTypes.Claver,CardNumber.AAAA),
        Card(CardTypes.Claver,CardNumber.Two),
    ))*/


    val emptyList = mutableListOf<String>()
    emptyList.add("")
    emptyList.add("Hai")
    emptyList.add("dddd")
    emptyList.add("")
    emptyList.add("")
    for ((value,value1) in emptyList.withIndex()){
        println(value)
      if (value==33) return
    }

    val mutableMapOf = mutableMapOf<String,List<Int>>()

    for ((key, value) in mutableMapOf){

        println(key +"----"+ value)
    }


}

class TestClass(val numberOne : Int,private val numberTwo : Int){


    init {

    }

}

class CardFindingSystem(private var cardList: List<Card>) {
    var cardTypeMap = emptyMap<CardTypes,Int>()
    var cardNumberMap = emptyMap<CardNumber,Int>()
    var sortedCardNumberList = emptyList<Card>()
    init {
        sortedCardNumberList =cardList.sortedWith(cardComparator)
        cardTypeMap = cardList.groupBy { it.cardType }.mapValues { (_,cardType) ->cardType.size }.toMutableMap()
        cardNumberMap = cardList.groupBy { it.cardNumber }.mapValues { (_,cardNumber)->cardNumber.size }.toMutableMap()
    }

    fun findCardSystemType ():OutputType{
        if (isRoyalFlush()){
            return OutputType.RoyalFlush
        }
       return OutputType.HighCard
    }

    private fun isRoyalFlush():Boolean{
        if (sortedCardNumberList.get(0).cardNumber==CardNumber.Ten && sortedCardNumberList.get(4).cardNumber==CardNumber.AAAA) {
            for (value in cardTypeMap.values){
                if (value==5) return true
            }
            return true
        }
        return false
    }
}

sealed class OutputType{
    object RoyalFlush :OutputType()
    object StraightFlush :OutputType()
    object FourOfaKind :OutputType()
    object FullHouse :OutputType()
    object Flush :OutputType()
    object Straight :OutputType()
    object ThreeOfaKind :OutputType()
    object TwoPair :OutputType()
    object OnePair :OutputType()
    object HighCard :OutputType()
}
val cardComparator = Comparator<Card> { card1, card2 ->
    if (card1.cardNumber.cardvalue != card2.cardNumber.cardvalue){
        card1.cardNumber.cardvalue-card2.cardNumber.cardvalue
    }else{
        card1.cardType.toString().compareTo(card2.cardType.toString())
    }
}

data class Card(
    val cardType : CardTypes,
    val cardNumber : CardNumber
)


sealed class  CardNumber(val cardvalue :Int){
    object Two :CardNumber(2)
    object Three :CardNumber(3)
    object Four :CardNumber(4)
    object Five :CardNumber(5)
    object Six :CardNumber(6)
    object Seven :CardNumber(7)
    object Eight :CardNumber(8)
    object Nine :CardNumber(9)
    object Ten :CardNumber(10)
    object JJJJ :CardNumber(11)
    object QQQQ :CardNumber(12)
    object KKKK :CardNumber(13)
    object AAAA :CardNumber(14)
}

sealed class CardTypes{
    object Diamond :CardTypes()
    object Spade :CardTypes()
    object Heart :CardTypes()
    object Claver :CardTypes()
}


