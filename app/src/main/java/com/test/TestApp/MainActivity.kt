package com.test.TestApp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.test.TestApp.ListViewTest.ListViewTestActivity
import com.test.TestApp.PrefectureListView.PrefectureActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupWidget()
    }

    private fun setupWidget() {
        btnListViewTest.setOnClickListener {
            val intent = Intent(this, ListViewTestActivity::class.java)
            startActivity(intent)
        }

        btnPrefectureListView.setOnClickListener {
            val intent = Intent(this, PrefectureActivity::class.java)
            startActivity(intent)
        }
    }
}