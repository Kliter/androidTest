package com.test.TestApp.RecyclerViewTest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.test.TestApp.R
import kotlinx.android.synthetic.main.activity_recyclerviewtest.*

class RecyclerViewTestActivity: AppCompatActivity(), RecyclerViewTestViewHolder.ItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerviewtest)

        val pokes = resources.getStringArray(R.array.pokeName).toMutableList()

        recyclerView.adapter = RecyclerViewTestAdapter(this, this, pokes)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(applicationContext, "position $position was tapped", Toast.LENGTH_SHORT).show()
    }
}