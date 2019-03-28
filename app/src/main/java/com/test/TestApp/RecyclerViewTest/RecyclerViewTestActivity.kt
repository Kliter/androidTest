package com.test.TestApp.RecyclerViewTest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.test.TestApp.MainActivity
import com.test.TestApp.R
import com.test.TestApp.Util.BottomNavigationViewManager
import com.test.TestApp.Util.ToolbarManager
import kotlinx.android.synthetic.main.activity_recyclerviewtest.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class RecyclerViewTestActivity: AppCompatActivity(), RecyclerViewTestViewHolder.ItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerviewtest)
        ToolbarManager.setupToolbar(this, app_bar)
        BottomNavigationViewManager.setupBottomNavigationView(this, bottomNavigationView)

        val pokes = resources.getStringArray(R.array.pokeName).toMutableList()

        recyclerView.adapter = RecyclerViewTestAdapter(this, this, pokes)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(applicationContext, "position $position was tapped", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(menuItem: MenuItem?): Boolean {
        ToolbarManager.setOptionsItemSelected(this, menuItem)
        return super.onOptionsItemSelected(menuItem)
    }
}