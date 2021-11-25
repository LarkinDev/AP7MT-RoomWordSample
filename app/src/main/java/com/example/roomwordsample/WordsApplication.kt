package com.example.roomwordsample

import android.app.Application
import com.example.roomwordsample.database.WordRepository
import com.example.roomwordsample.database.WordRoomDatabase

class WordsApplication : Application() {
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}