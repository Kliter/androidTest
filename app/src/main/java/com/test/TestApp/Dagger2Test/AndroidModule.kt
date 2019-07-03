package com.test.TestApp.Dagger2Test

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AndroidModule(private val application: Application) {

    @Provides
    fun provideApplicationContext(): Context = application
}