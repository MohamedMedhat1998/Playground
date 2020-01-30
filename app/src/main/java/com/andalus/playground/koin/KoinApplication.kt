package com.andalus.playground.koin

import android.app.Application
import com.andalus.playground.data.DataSource
import com.andalus.playground.data.LocalDatabase
import com.andalus.playground.data.Repository
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

val myModule = module {
    single { LocalDatabase(get()) as DataSource }
    factory { Repository(get()) }
}

class KoinApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@KoinApplication)
            // declare modules
            modules(myModule)
        }
    }
}