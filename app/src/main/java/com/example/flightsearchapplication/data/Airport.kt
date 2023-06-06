package com.example.flightsearchapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Airport")
data class Airport(
    @PrimaryKey(autoGenerate = true)
    val airportId: Int = 0,

    @ColumnInfo(name = "iata_code")
    val airTransportCode: String,

    @ColumnInfo(name ="name")
    val airportName: String,

    @ColumnInfo(name = "passengers")
    val totalNumberOfAPassengers: Int
)
