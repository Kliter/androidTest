package com.test.TestApp.ListViewTest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.test.TestApp.R
import com.test.TestApp.Util.BottomNavigationViewManager
import com.test.TestApp.Util.ToolbarManager
import kotlinx.android.synthetic.main.activity_listview.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class ListViewTestActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        ToolbarManager.setupToolbar(this, app_bar)
        BottomNavigationViewManager.setupBottomNavigationView(this, bottomNavigationView)

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

    override fun onOptionsItemSelected(menuItem: MenuItem?): Boolean {
        ToolbarManager.setOptionsItemSelected(this, menuItem)
        return super.onOptionsItemSelected(menuItem)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top, menu)
        return super.onCreateOptionsMenu(menu)
    }
}