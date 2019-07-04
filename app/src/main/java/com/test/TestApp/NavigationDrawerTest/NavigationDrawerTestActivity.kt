package com.test.testapp.navigationdrawertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.test.testapp.R
import kotlinx.android.synthetic.main.activity_navigation_drawer_test.*

class NavigationDrawerTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer_test)

        drawer_container.openDrawer(GravityCompat.START)

        navigation_view.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_home -> {
                    Toast.makeText(this, "nav_home", Toast.LENGTH_SHORT).show()
                }
                R.id.action_mail -> {
                    Toast.makeText(this, "nav_home", Toast.LENGTH_SHORT).show()
                }
                R.id.action_notification -> {
                    Toast.makeText(this, "nav_home", Toast.LENGTH_SHORT).show()
                }
                R.id.action_search -> {
                    Toast.makeText(this, "nav_home", Toast.LENGTH_SHORT).show()
                }
                R.id.action_camera -> {
                    Toast.makeText(this, "nav_home", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    return@setNavigationItemSelectedListener false
                }
            }
            return@setNavigationItemSelectedListener false
        }
    }
}
