package com.test.testapp.recyclerviewtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.test.testapp.R
import com.test.testapp.util.BottomNavigationViewManager
import com.test.testapp.util.ToolbarManager
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
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this, androidx.recyclerview.widget.LinearLayoutManager.VERTICAL, false)
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