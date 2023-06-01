package com.example.busschedule.data

import android.content.Context

interface AppContainer {
    val busscheduleRepository: BusScheduleRepository
}

class AppDataContainer(private val context: Context) : AppContainer {
    override val busscheduleRepository: BusScheduleRepository by lazy {
        DefaultBusScheduleRepository(BusSchedeuleDatabase.getDatabase(context).busScheduleDao())
    }
}