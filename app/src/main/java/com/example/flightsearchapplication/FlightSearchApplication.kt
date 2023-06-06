package com.example.flightsearchapplication

import android.app.Application
import com.example.flightsearchapplication.data.AppContainer
import com.example.flightsearchapplication.data.AppDataContainer

class FlightSearchApplication : Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}