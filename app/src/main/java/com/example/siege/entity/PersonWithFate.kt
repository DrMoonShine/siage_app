package com.example.siege.entity

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class PersonWithFate(
    @Embedded val person: Person,
    @Relation(
        parentColumn = "personId",
        entityColumn = "fateId",
        associateBy = Junction(PersonFateCrossRef::class)
    ) val fate: List<Fate>
)
