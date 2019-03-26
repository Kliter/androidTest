package com.test.TestApp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.test.TestApp.ListViewTest.ListViewTestActivity
import com.test.TestApp.PokeCardList.PokeCardListActivity
import com.test.TestApp.PrefectureListView.PrefectureActivity
import com.test.TestApp.RecyclerViewTest.RecyclerViewTestActivity
import com.test.TestApp.TextInputTest.TextInputTestActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar()
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

    private fun setupToolbar() {
        val toolbar: Toolbar = app_bar
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val intent = Intent()
        when (item?.itemId) {
            R.id.action_listviewtest -> {
                intent.setClass(this, ListViewTestActivity::class.java)
            }
            R.id.action_prefecture_listview -> {
                intent.setClass(this, PrefectureActivity::class.java)
            }
            R.id.action_recyclerviewtest -> {
                intent.setClass(this, RecyclerViewTestActivity::class.java)
            }
            R.id.action_pokecardlist -> {
                intent.setClass(this, PokeCardListActivity::class.java)
            }
            R.id.action_textinput -> {
                intent.setClass(this, TextInputTestActivity::class.java)
            }
        }
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}