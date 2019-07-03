package com.test.TestApp.KoinTest

interface GreetingRepositoryContract {
    fun greet(): String
}

class GreetingRepository: GreetingRepositoryContract {
    override fun greet() = "Hello Koin from Repository!"
}