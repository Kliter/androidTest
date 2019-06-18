package com.test.TestApp.VolleyTest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.test.TestApp.R
import com.test.TestApp.Util.BottomNavigationViewManager
import com.test.TestApp.Util.ToolbarManager
import kotlinx.android.synthetic.main.activity_volleytest.*
import kotlinx.android.synthetic.main.snippet_toolbar.*


class VolleyTestActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volleytest)
        ToolbarManager.setupToolbar(this, app_bar)
        BottomNavigationViewManager.setupBottomNavigationView(this, bottomNavigationView)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.volleyTestContainer, VolleyTestButtonsFragment())
                .addToBackStack(null)
                .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        ToolbarManager.setOptionsItemSelected(this, item)
        return super.onOptionsItemSelected(item)
    }
}