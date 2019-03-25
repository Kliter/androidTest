package com.test.TestApp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.test.TestApp.ListViewTest.ListViewTestActivity
import com.test.TestApp.PokeCardList.PokeCardListActivity
import com.test.TestApp.PrefectureListView.PrefectureActivity
import com.test.TestApp.RecyclerViewTest.RecyclerViewTestActivity
import com.test.TestApp.TextInputTest.TextInputTestActivity
import kotlinx.android.synthetic.main.activity_main.*
import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CalligraphyConfig.initDefault(
                CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/Roboto-Regular.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        )

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

        btnRecyclerViewTest.setOnClickListener {
            val intent = Intent(this, RecyclerViewTestActivity::class.java)
            startActivity(intent)
        }

        btnPokeCardList.setOnClickListener {
            val intent = Intent(this, PokeCardListActivity::class.java)
            startActivity(intent)
        }

        btnTextInputTest.setOnClickListener {
            val intent =  Intent(this, TextInputTestActivity::class.java)
            startActivity(intent)
        }
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }
}