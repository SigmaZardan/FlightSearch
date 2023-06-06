package com.example.flightsearchapplication.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteDao {
    @Query("SELECT * from Favorite WHERE departure_code = :chosenAirportCode")
    fun getAvailableFlightsFromAirport(chosenAirportCode: String): Flow<List<Favorite>>
}