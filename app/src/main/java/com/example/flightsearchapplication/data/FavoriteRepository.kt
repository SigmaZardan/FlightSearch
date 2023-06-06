package com.example.flightsearchapplication.data

import kotlinx.coroutines.flow.Flow

interface FavoriteRepository {
    fun getAllFavoriteStream(chosenAirportCode: String): Flow<List<Favorite>>
}