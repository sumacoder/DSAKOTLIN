package com.dsakotlin.recursion

    fun main(args: Array<String>){
        val n = 4;
        towerofHanoi(n,'A','Z','X')
//        println("\nf($n) =$fib \n")

    }

    fun towerofHanoi(n:Int, from:Char, to:Char, aux:Char ){

        if(n == 1){
            println("Move disk 1 from rod ${from}  to rod ${to}");
            return;
        }

        towerofHanoi(n-1,from,aux,to)
        println("Move disk ${n}  from rod   ${from}   to rod   ${to}");

        towerofHanoi(n-1,aux,to,from)

    }