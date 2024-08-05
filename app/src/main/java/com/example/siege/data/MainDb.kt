package com.example.siege.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.siege.entity.Fate
import com.example.siege.entity.Person
import com.example.siege.entity.PersonFateCrossRef
import com.example.siege.entity.Player
import com.example.siege.entity.Provisions

@Database(entities = [Fate::class, Person::class,Player::class,Provisions::class,PersonFateCrossRef::class],
    version = 1
)
abstract class MainDb: RoomDatabase(){

}