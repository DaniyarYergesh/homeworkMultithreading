package com.example.homework_recyclerview.presentation

import android.app.Application
import com.example.homework_recyclerview.di.mainModule
import org.koin.core.context.startKoin

class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin { modules(mainModule)  }
    }
}