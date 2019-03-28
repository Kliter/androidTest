package com.test.TestApp.TextInputTest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.test.TestApp.ListViewTest.ListViewTestActivity
import com.test.TestApp.MainActivity
import com.test.TestApp.PokeCardList.PokeCardListActivity
import com.test.TestApp.PrefectureListView.PrefectureActivity
import com.test.TestApp.R
import com.test.TestApp.RecyclerViewTest.RecyclerViewTestActivity
import com.test.TestApp.Util.BottomNavigationViewManager
import com.test.TestApp.Util.ToolbarManager
import kotlinx.android.synthetic.main.activity_prefecture_listview.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class TextInputTestActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_textinputtest)
        ToolbarManager.setupToolbar(this, app_bar)
        BottomNavigationViewManager.setupBottomNavigationView(this, bottomNavigationView)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

    override fun onOptionsItemSelected(menuItem: MenuItem?): Boolean {
        ToolbarManager.setOptionsItemSelected(this, menuItem)
        return super.onOptionsItemSelected(menuItem)
    }
}