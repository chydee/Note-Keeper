package com.chydee.notekeeper

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.chydee.notekeeper.database.NoteDatabase
import com.chydee.notekeeper.database.NoteDatabaseDao
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NoteDatabaseTest {

    private lateinit var noteDao: NoteDatabaseDao
    private lateinit var db: NoteDatabase

    fun createDb() {

    }
}