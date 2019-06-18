package com.test.TestApp.Util

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.MenuItem
import com.test.TestApp.ListViewTest.ListViewTestActivity
import com.test.TestApp.MainActivity
import com.test.TestApp.PokeCardList.PokeCardListActivity
import com.test.TestApp.PrefectureListView.PrefectureActivity
import com.test.TestApp.R
import com.test.TestApp.RecyclerViewTest.RecyclerViewTestActivity
import com.test.TestApp.TextInputTest.TextInputTestActivity
import kotlinx.android.synthetic.main.snippet_toolbar.*

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