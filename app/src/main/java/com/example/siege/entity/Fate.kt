package com.example.siege.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fate_table")
data class Fate(
    @PrimaryKey(autoGenerate = true) val fateId: Int? = null,
    val escape: Boolean,
    val hunger: Boolean,
    val thirst: Boolean,
    val fight: Boolean,
    val job: Boolean
)

