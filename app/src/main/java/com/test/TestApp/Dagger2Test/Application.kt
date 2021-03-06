package com.test.testapp.dagger2test

import android.app.Application
import okhttp3.internal.lockAndWaitNanos

class Application: Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent.builder().androidModule(AndroidModule(this)).build()
    }
}