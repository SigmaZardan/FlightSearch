package com.example.flightsearchapplication.data

import kotlinx.coroutines.flow.Flow

class OfflineAirportRepository(private val airportDao: AirportDao) : AirportRepository {
    override fun getAllAirportStreams(pattern: String): Flow<List<Airport>> =
        airportDao.getMatchingAirportBasedOnInput(pattern)
}