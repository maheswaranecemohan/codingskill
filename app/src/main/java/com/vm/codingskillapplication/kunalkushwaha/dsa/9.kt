package com.vm.codingskillapplication.kunalkushwaha.dsa
fun main(array: Array<String>) {
    /*val `in` = Scanner(System.`in`)
    val num1: Int
    val num2: Int
    val sum: Int

    print("Enter number 1: ")
    num1 = `in`.nextInt()
    System.out.println("The sum = $sum")*/

/*---------------------------------------------------------*/
    /*1. Fibonachi Numbers
    Add previous 2 numbers
    EX) 0,1,1,2,3,5,8,13,21,.
    */
    //fibonacciSequence()
/*---------------------------------------------------------*/
    /*2. 12345679737 .....

    Find how may times the number 7 has accured
    */
    //findOccurnce(7894378937493777)
/*---------------------------------------------------------*/
    /*3. 12345679737 .....

    Find reverse of a number
    */
    //findReverseOfANumber(123456789)
    //findReverseNmber(123456789)
/*---------------------------------------------------------*/

    /*3. 12345679737 .....

    Find reverse of a number
    */
   calculatorProgram()
/*---------------------------------------------------------*/
}

fun calculatorProgram() {

}

fun findReverseNmber(input: Int) {
    var n = input
    var answer =0
    while (n>0){
    var rem = n%10
    n=n/10
    answer = answer*10 +rem
    }
    System.out.println(answer)
}


fun findReverseOfANumber(givenNumber: Long) {
    var n =givenNumber
     var answer :String? =""
    while (n>0){
        var lastDigit = n%10
        n = n/10
        answer=answer+"$lastDigit"
    }
    System.out.println(answer)
}

fun findOccurnce(number: Long){
    var n = number
    var count =0
    var find =4L
    while (n>0){
       var reminder = n%10
        n /= 10
        if (reminder==find) {
            count++
        }
    }
    System.out.println(count)
}

fun fibonacciSequence() {
    var a = 0
    var b = 1
    var output = 0
    //Find n th fibonacci number
    var n = 10-2
    System.out.println("$n" + "Fibonacci Sequence...")
    for (i in 0..n) {
        output = a+b
        a = b
        b = output
    }
    System.out.println(output)
}
