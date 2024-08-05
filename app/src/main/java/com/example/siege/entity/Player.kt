package com.example.siege.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "player_table")
data class Player(
    @PrimaryKey(autoGenerate = true) val playerId: Int? = null,
    val name: String,
    val personId: Int,
    val friend: Int,
    val enemy: Int,
    val place: Int,
    val tired: Int,
    val brawl: Boolean,
    val points: Int
)
