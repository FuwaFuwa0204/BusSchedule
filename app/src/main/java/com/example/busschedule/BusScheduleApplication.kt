package com.example.busschedule

import android.app.Application
import com.example.busschedule.data.AppContainer
import com.example.busschedule.data.AppDataContainer
import com.example.busschedule.data.BusSchedeuleDatabase

class BusScheduleApplication : Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
    //val database: BusSchedeuleDatabase by lazy { BusSchedeuleDatabase.getDatabase(this) }
}