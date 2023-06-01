package com.example.busschedule.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BusSchedule::class], version = 1)
abstract class BusSchedeuleDatabase : RoomDatabase() {

    abstract fun busScheduleDao(): BusScheduleDAO

    companion object {
        @Volatile
        private var Instance: BusSchedeuleDatabase? = null

        fun getDatabase(context: Context): BusSchedeuleDatabase {
            return Instance?: synchronized(this) {
                Room.databaseBuilder(context, BusSchedeuleDatabase::class.java, "busSchedule_database")
                    //유형 불일치 오류
                    .createFromAsset("database/bus_schedule.db")
                    .fallbackToDestructiveMigration()
                    .build()
                    //db 인스턴스에 대한 참조 유지
                    .also { Instance = it }
            }
        }
    }

}