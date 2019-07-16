package com.dsakotlin.recursion

fun main(args: Array<String>){
//ascending condition
  val arr = arrayOf(23,56,78,79,89,91,93,94,95)
     println("this array arr is sorted ? ${isArrayInSortedOrder( arr  ,arr.size)}")
}


fun isArrayInSortedOrder(vals:Array<Int>, index:Int):Boolean {
    println("index ${index}")
    return if (index <= 1) true
    else
        if (vals[index - 1] < vals[index - 2])
            false else isArrayInSortedOrder(vals, index - 1)



}
