package com.dsakotlin.recursion

fun main(args: Array<String>){
    val n = 10;
    val oper = "*"
    val fib = fibonacci(n)
    println("\nf($n) =$fib \n")

}

fun fibonacci(n:Int) : Int{

    if (n == 0 ) {
        print(1)
        return 1
    }else{
        print("$n ,")
        return n + fibonacci(n-1)
    }
}