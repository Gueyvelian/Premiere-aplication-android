package com.example.first_application

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.fold
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.flow.zip

suspend fun main() {
    val res = compute1()
    val resAl = compute2()
    val res10 = compute3()
    val res4 = compute4()

    //exo 4
    //res10.conflate()
    //    .onEach { delay(500L) }
    //    .collect { println("Emission de $it") }

    //exo 3
    //res10.take(3)
        //res10.takeWhile { it<5 }
    //println(res10.first{it>7})

    //exo 2
    //val resultat = res.zip(compute2()){a, b -> Pair(a, b)}
    //resultat.collect { println(it) }

    //exo 1
        //.filter { it%2 != 0 }
        //.fold(0){acc, b -> acc + b}
    //println (res2)
}

fun compute1(): Flow<Int> {
    return flow {
        emit (1)
        delay (300L)
        emit(2)
        delay (300L)
        emit (3)
    }
}

fun compute2(): Flow<String> {
    return flow {
        emit ("A")
        delay (200L)
        emit("B")
        delay (200L)
        emit ("C")
    }
}

fun compute3(): Flow<Int> {
    return flow {
        for ( i in 1 .. 10){
            emit (i)
            delay (200L)
        }
    }
}

fun compute4(): Flow<Int> {
    return flow {
        emit (4)
        delay (300L)
        emit(5)
        delay (300L)
        emit (6)
    }
}