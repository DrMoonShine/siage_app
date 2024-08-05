package com.example.siege.entity

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class FateWithPerson(
    @Embedded val fate: Fate,
    @Relation(
        parentColumn = "fateId",
        entityColumn = "personId",
        associateBy = Junction(PersonFateCrossRef::class)
    ) val person: List<Person>
)
