package com.example.praktikum_pertemuan12

import android.app.Application
import com.example.praktikum_pertemuan12.di.AppContainer
import com.example.praktikum_pertemuan12.di.MahasiswaContainer

class MahasiswaApplications:Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}