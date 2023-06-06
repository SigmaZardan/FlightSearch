package com.example.flightsearchapplication.data

import kotlinx.coroutines.flow.Flow

class OfflineFavoriteRepository(private val favoriteDao: FavoriteDao) : FavoriteRepository {
    override fun getAllFavoriteStream(chosenAirportCode: String): Flow<List<Favorite>> =
        favoriteDao.getAvailableFlightsFromAirport(chosenAirportCode = chosenAirportCode)
}