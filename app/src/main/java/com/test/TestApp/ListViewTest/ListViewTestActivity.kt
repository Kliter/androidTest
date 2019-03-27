package com.test.TestApp.ListViewTest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import com.test.TestApp.MainActivity
import com.test.TestApp.R
import kotlinx.android.synthetic.main.activity_listview.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class ListViewTestActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        setupToolbar()
        setupBottomNavigationView()

        val names: List<String> = listOf(
                "User1",
                "User2",
                "User3",
                "User4",
                "User5",
                "User6",
                "User7",
                "User8",
                "User9",
                "User10"
        )

        val descriptions: List<String>  = listOf(
                "オッス!!オラ悟空1!!",
                "オッス!!オラ悟空2!!",
                "オッス!!オラ悟空3!!",
                "オッス!!オラ悟空4!!",
                "オッス!!オラ悟空5!!",
                "オッス!!オラ悟空6!!",
                "オッス!!オラ悟空7!!",
                "オッス!!オラ悟空8!!",
                "オッス!!オラ悟空9!!",
                "オッス!!オラ悟空10!!"
        )

        val listItems = List(10) { i -> ListViewTestItemData(names[i], descriptions[i]) }

        val adapter = ListViewTestAdapter(this, listItems)
        listView.adapter = adapter
    }

    private fun setupToolbar() {
        val toolbar: Toolbar = app_bar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupBottomNavigationView() {
        bottomNavigationView.selectedItemId = R.id.action_search
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
}