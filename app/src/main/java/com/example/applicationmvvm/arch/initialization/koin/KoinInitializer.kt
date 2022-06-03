package com.example.applicationmvvm.arch.initialization.koin

import android.content.Context
import androidx.startup.Initializer

class KoinInitializer : Initializer<KoinDependency> {
    override fun create(context: Context): KoinDependency {
        return KoinDependency(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}