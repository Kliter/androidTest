package com.test.testapp.sqlitetest

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class TestOpenHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "TestDB.db"
        private const val TABLE_NAME = "testdb"
        private const val _ID = "_id"
        private const val COLUMN_NAME_TITLE = "title"
        private const val COLUMN_NAME_SUBTITLE = "score"

        private const val SQL_CREATE_ENTRIES =
                "CREATE TABLE $TABLE_NAME ($_ID INTEGER PRIMARY KEY, $COLUMN_NAME_TITLE TEXT, $COLUMN_NAME_SUBTITLE INTEGER)"

        private const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS $TABLE_NAME"
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }

    fun saveData(db: SQLiteDatabase, title: String, score: Int) {
        val values: ContentValues = ContentValues()
        values.put("title", title)
        values.put("score", score)

        db.insert("testdb", null, values)
    }
}