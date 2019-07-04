package com.test.testapp.pokecardlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.test.testapp.R
import com.test.testapp.util.BottomNavigationViewManager
import com.test.testapp.util.ToolbarManager
import kotlinx.android.synthetic.main.activity_pokecardlist.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class PokeCardListActivity: AppCompatActivity(), PokeCardListViewHolder.ItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokecardlist)
        ToolbarManager.setupToolbar(this, app_bar)
        BottomNavigationViewManager.setupBottomNavigationView(this, bottomNavigationView)

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
        pokeCardRecyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this, androidx.recyclerview.widget.LinearLayoutManager.VERTICAL, false)
    }

    override fun onOptionsItemSelected(menuItem: MenuItem?): Boolean {
        ToolbarManager.setOptionsItemSelected(this, menuItem)
        return super.onOptionsItemSelected(menuItem)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(applicationContext, "position $position was tapped", Toast.LENGTH_SHORT).show()
    }
}
