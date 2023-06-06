package com.example.flightsearchapplication.data

import kotlinx.coroutines.flow.Flow

interface AirportRepository {

    fun getAllAirportStreams(pattern: String): Flow<List<Airport>>
}