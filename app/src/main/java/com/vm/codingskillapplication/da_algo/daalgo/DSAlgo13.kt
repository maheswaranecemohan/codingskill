package com.vm.codingskillapplication.da_algo.daalgo
import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

@RequiresApi(Build.VERSION_CODES.N)
fun main(args :Array<String>){
//. How do you reverse a Linked List?

var linkList = LinkedList<Int>()

linkList.add(1)
linkList.add(2)
linkList.add(3)
var linkLis2 = LinkedList<Int>()

    linkList.descendingIterator().forEach {
        linkLis2.add(it)
    }

    linkLis2.forEach {

        System.out.println(it)
    }


}






