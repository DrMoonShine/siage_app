package com.example.siege.entity

import androidx.room.Entity

@Entity(primaryKeys = ["personId", "fateId"], tableName = "personFateCrossRef_table")
data class PersonFateCrossRef(
    val personId: Int,
    val fateId: Int
)
