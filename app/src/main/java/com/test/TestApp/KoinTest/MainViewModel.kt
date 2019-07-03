package com.test.TestApp.KoinTest

interface MainViewModelContract {
    fun greet(): String
}

class MainViewModel(private val greetingRepository: GreetingRepositoryContract): MainViewModelContract {
    override fun greet() = this.greetingRepository.greet()
}