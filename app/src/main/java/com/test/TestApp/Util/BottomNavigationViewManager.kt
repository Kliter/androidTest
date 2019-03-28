package com.test.TestApp.Util

import android.content.Intent
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.test.TestApp.MainActivity
import com.test.TestApp.R

class BottomNavigationViewManager {

    companion object BottomNavigationViewManager {

        fun setupBottomNavigationView(
                activity: AppCompatActivity,
                bottomNavigationView: BottomNavigationView) {

            bottomNavigationView.setOnNavigationItemSelectedListener {
                val intent = Intent()
                when (it.itemId) {
                    R.id.action_home -> {
                        intent.setClass(activity, MainActivity::class.java)
                        activity.startActivity(intent)
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
    }
}