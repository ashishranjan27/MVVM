package com.example.mvvm

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(){

    cricket().stop()
    cricket().start()

}

interface play{
    fun start()
    fun stop(){
        println("stop")
    }
}

class cricket : play{
    override fun start() {
        println("started")
    }

}