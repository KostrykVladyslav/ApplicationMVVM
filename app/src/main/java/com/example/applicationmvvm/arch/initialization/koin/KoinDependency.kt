package com.example.applicationmvvm.arch.initialization.koin

import android.content.Context
import com.example.applicationmvvm.BuildConfig
import com.example.applicationmvvm.arch.di.app
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class KoinDependency(private val context: Context) {
    init {
        initializeKoin()
    }

    private fun initializeKoin() {
        startKoin {
            androidContext(context)
            if (BuildConfig.DEBUG) {
                androidLogger(Level.ERROR)
            }
            modules(modules = app)
        }
    }
}