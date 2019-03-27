package com.test.TestApp.PokeCardList

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.test.TestApp.ListViewTest.ListViewTestActivity
import com.test.TestApp.MainActivity
import com.test.TestApp.PrefectureListView.PrefectureActivity
import com.test.TestApp.R
import com.test.TestApp.TextInputTest.TextInputTestActivity
import kotlinx.android.synthetic.main.activity_pokecardlist.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class PokeCardListActivity: AppCompatActivity(), PokeCardListViewHolder.ItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokecardlist)
        setupToolbar()
        setupBottomNavigationView()

        val pokeImageArray: List<Int> = listOf(
                R.drawable.bulbasaur,
                R.drawable.ivysaur,
                R.drawable.venusaur,
                R.drawable.charmander,
                R.drawable.charmeleon,
                R.drawable.charizard,
                R.drawable.squirtle,
                R.drawable.wartortle,
                R.drawable.blastoise
        )
        val pokeNameArray = resources.getStringArray(R.array.pokeName).toMutableList()
        val pokeDescriptionArray = resources.getStringArray(R.array.pokeDescription).toMutableList()

        pokeCardRecyclerView.adapter = PokeCardListAdapter(this, this, pokeImageArray, pokeNameArray, pokeDescriptionArray)
        pokeCardRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun setupToolbar() {
        val toolbar: Toolbar = app_bar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val intent = Intent()
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
                intent.setClass(this, RecyclerView.Recycler::class.java)
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

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(applicationContext, "position $position was tapped", Toast.LENGTH_SHORT).show()
    }
}
