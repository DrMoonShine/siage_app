package com.example.siege.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "person_table")
data class Person(
    @PrimaryKey(autoGenerate = true) val personId: Int? = null,
    val name: String,
    val avatar: String,
    val power: Int,
    val hp: Int,
    val ability: String
)
