package com.example.busschedule.data

import androidx.room.Query
import kotlinx.coroutines.flow.Flow

//DAO 구현에 매핑되는 다음 함수를 인터페이스에 추가한다.
interface BusScheduleRepository {

    fun getItem(name:String): Flow<List<BusSchedule>>

    fun getAllItems(): Flow<List<BusSchedule>>

}

class DefaultBusScheduleRepository(private val BusScheduleDAO:BusScheduleDAO):BusScheduleRepository {
    override fun getItem(name: String): Flow<List<BusSchedule>> = BusScheduleDAO.getItem(name)

    override fun getAllItems(): Flow<List<BusSchedule>> = BusScheduleDAO.getAllItems()
}