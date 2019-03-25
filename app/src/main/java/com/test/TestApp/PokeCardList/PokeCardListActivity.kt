package com.test.TestApp.PokeCardList

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.test.TestApp.R
import kotlinx.android.synthetic.main.activity_pokecardlist.*

class PokeCardListActivity: AppCompatActivity(), PokeCardListViewHolder.ItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokecardlist)

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

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(applicationContext, "position $position was tapped", Toast.LENGTH_SHORT).show()
    }
}
