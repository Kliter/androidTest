package com.test.testapp.kointest

interface GreetingRepositoryContract {
    fun greet(): String
}

class GreetingRepository: GreetingRepositoryContract {
    override fun greet() = "Hello Koin from Repository!"
}