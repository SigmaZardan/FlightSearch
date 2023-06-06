package com.example.flightsearchapplication.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface AirportDao {
    @Query("SELECT * FROM Airport WHERE iata_code LIKE :pattern OR name LIKE :pattern ORDER BY passengers DESC")
    fun getMatchingAirportBasedOnInput(pattern: String): Flow<List<Airport>>
}