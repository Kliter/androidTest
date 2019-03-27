package com.test.TestApp.RecyclerViewTest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.test.TestApp.ListViewTest.ListViewTestActivity
import com.test.TestApp.MainActivity
import com.test.TestApp.PokeCardList.PokeCardListActivity
import com.test.TestApp.PrefectureListView.PrefectureActivity
import com.test.TestApp.R
import com.test.TestApp.TextInputTest.TextInputTestActivity
import kotlinx.android.synthetic.main.activity_recyclerviewtest.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class RecyclerViewTestActivity: AppCompatActivity(), RecyclerViewTestViewHolder.ItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerviewtest)
        setupToolbar()
        setupBottomNavigationView()

        val pokes = resources.getStringArray(R.array.pokeName).toMutableList()

        recyclerView.adapter = RecyclerViewTestAdapter(this, this, pokes)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(applicationContext, "position $position was tapped", Toast.LENGTH_SHORT).show()
    }

    private fun setupToolbar() {
        val toolbar: Toolbar = app_bar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener {
            val intent = Intent()
            when (it.itemId) {
                R.id.action_home -> {
                    intent.setClass(this, MainActivity::class.java)
                    startActivity(intent)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_search -> {
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_notification -> {
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_mail -> {
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        intent = Intent()
        when (item?.itemId) {
            R.id.action_listviewtest -> {
                intent.setClass(this, ListViewTestActivity::class.java)
                startActivity(intent)
            }
            R.id.action_prefecture_listview -> {
                intent.setClass(this, PrefectureActivity::class.java)
                startActivity(intent)
            }
            R.id.action_recyclerviewtest -> {
                intent.setClass(this, RecyclerViewTestActivity::class.java)
                startActivity(intent)
            }
            R.id.action_pokecardlist -> {
                intent.setClass(this, PokeCardListActivity::class.java)
                startActivity(intent)
            }
            R.id.action_textinput -> {
                intent.setClass(this, TextInputTestActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}