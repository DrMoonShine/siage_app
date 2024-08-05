package com.example.siege.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "provisions_table")
data class Provisions(
    @PrimaryKey(autoGenerate = true) val provisionsId: Int? = null,
    val name: String,
    val description: String,
    val property: Int,
    val playerID: Int?
)
