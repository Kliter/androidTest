package com.test.testapp.dagger2test

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidModule::class))
interface ApplicationComponent {

    fun inject(activity: Dagger2TestActivity)
}