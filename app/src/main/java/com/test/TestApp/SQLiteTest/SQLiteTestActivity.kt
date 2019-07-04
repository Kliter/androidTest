package com.test.testapp.sqlitetest

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.test.testapp.R
import kotlinx.android.synthetic.main.activity_sqlitetest.*
import java.lang.StringBuilder

class SQLiteTestActivity: AppCompatActivity() {

    private var textView: TextView? = null
    private var helper: TestOpenHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlitetest)

        helper = TestOpenHelper(this)
        textView = findViewById(R.id.text_view)

        btnShowData.setOnClickListener {
            readData()
        }
        btnAddData.setOnClickListener {
            saveData()
        }
    }

    private fun readData() {
        val db: SQLiteDatabase = helper?.readableDatabase!!
        val cursor: Cursor = db.query(
                "testdb",
                arrayOf<String>("title", "score"),
                null,
                null,
                null,
                null,
                null
        )

        cursor.moveToFirst()
        val stringBuilder = StringBuilder()

        for (i in 0 until cursor.count) {
            stringBuilder.append(cursor.getString(0))
            stringBuilder.append(":      ")
            stringBuilder.append(cursor.getInt(1))
            stringBuilder.append("点\n\n")
            cursor.moveToNext()
        }

        cursor.close()
        textView?.text = stringBuilder.toString()
    }

    private fun saveData() {
        val db: SQLiteDatabase = helper?.writableDatabase!!
        val values = ContentValues()

        val title: String = edit_text_key.text.toString()
        val score: String = edit_text_value.text.toString()

        values.put("title", title)
        values.put("score", score)

        db.insert("testdb", null, values)
    }
}