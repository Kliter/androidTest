package com.test.testapp.util

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.MenuItem
import com.test.testapp.listviewtest.ListViewTestActivity
import com.test.testapp.pokecardlist.PokeCardListActivity
import com.test.testapp.prefecturelistview.PrefectureActivity
import com.test.testapp.R
import com.test.testapp.recyclerviewtest.RecyclerViewTestActivity
import com.test.testapp.textinputtest.TextInputTestActivity

class ToolbarManager {

    companion object ToolbarManager {

        fun setOptionsItemSelected(context: Context, menuItem: MenuItem?) {
            val intent = Intent()
            when (menuItem?.itemId) {
                R.id.action_listviewtest -> {
                    intent.setClass(context, ListViewTestActivity::class.java)
                }
                R.id.action_prefecture_listview -> {
                    intent.setClass(context, PrefectureActivity::class.java)
                }
                R.id.action_recyclerviewtest -> {
                    intent.setClass(context, RecyclerViewTestActivity::class.java)
                }
                R.id.action_pokecardlist -> {
                    intent.setClass(context, PokeCardListActivity::class.java)
                }
                R.id.action_textinput -> {
                    intent.setClass(context, TextInputTestActivity::class.java)
                }
            }
            context.startActivity(intent)
        }

        fun setupToolbar(activity: AppCompatActivity, toolbar: Toolbar) {
            activity.setSupportActionBar(toolbar)
        }
    }
}