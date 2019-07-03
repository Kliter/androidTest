package com.test.TestApp.Dagger2Test

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidModule::class))
interface ApplicationComponent {

    fun inject(activity: Dagger2TestActivity)
}