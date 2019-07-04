package com.test.testapp.util

import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.test.testapp.MainActivity
import com.test.testapp.R

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