package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDAO {

   //:뒤가 매개변수 stopName
    @Query("SELECT * from Schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC")
    fun getItem(stopName:String): Flow<List<BusSchedule>>

    //모든항목 검색
    @Query("SELECT * from Schedule ORDER BY arrival_time ASC")
    fun getAllItems(): Flow<List<BusSchedule>>
}