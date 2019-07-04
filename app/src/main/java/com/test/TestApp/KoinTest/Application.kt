package com.test.testapp.kointest

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

class Application: Application() {

    override fun onCreate() {
        super.onCreate()

        // Create Koin Container.
        startKoin(this, listOf(
                        this.repositoryModule,
                        this.viewModelModule
        ))
    }

    private val repositoryModule: Module = module {
        factory { GreetingRepository() as GreetingRepositoryContract }
    }

    private val viewModelModule: Module = module {
        factory { MainViewModel(get()) as MainViewModelContract}
    }

//    // Koin Module
//    private val module: Module = module {
//        factory { GreetingRepository() }
//        factory { MainViewModel(get()) }
//    }
}