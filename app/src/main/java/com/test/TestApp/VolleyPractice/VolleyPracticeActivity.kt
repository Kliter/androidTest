package com.test.TestApp.VolleyPractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.test.TestApp.R
import com.test.TestApp.Util.ToolbarManager
import kotlinx.android.synthetic.main.activity_volleypractice.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class VolleyPracticeActivity: AppCompatActivity(), IVolley {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volleypractice)
        ToolbarManager.setupToolbar(this, app_bar)

        btnGet.setOnClickListener {
            MyVolleyRequest.getInstance(this@VolleyPracticeActivity, this@VolleyPracticeActivity)
                    .getRequest("https://jsonplaceholder.typicode.com/todos/1")
        }
        btnPost.setOnClickListener {
            MyVolleyRequest.getInstance(this@VolleyPracticeActivity, this@VolleyPracticeActivity)
                    .postRequest("https://jsonplaceholder.typicode.com/posts")
        }
        btnPut.setOnClickListener {
            MyVolleyRequest.getInstance(this@VolleyPracticeActivity, this@VolleyPracticeActivity)
                    .putRequest("https://jsonplaceholder.typicode.com/posts/1")
        }
        btnPatch.setOnClickListener {
            MyVolleyRequest.getInstance(this@VolleyPracticeActivity, this@VolleyPracticeActivity)
                    .patchRequest("https://jsonplaceholder.typicode.com/todos/1")
        }
        btnDelete.setOnClickListener {
            MyVolleyRequest.getInstance(this@VolleyPracticeActivity, this@VolleyPracticeActivity)
                    .deleteRequest("https://jsonplaceholder.typicode.com/todos/1")
        }
        btnImageLoader.setOnClickListener {
            networkImageView.setImageUrl(
                    "https://www.vectorstock.com/i/1000x1000/84/37/we-wish-you-a-merry-christmas-and-happy-new-year-vector-3178437.jpg",
                    MyVolleyRequest.getInstance(this@VolleyPracticeActivity).imageLoader
            )
        }
    }

    override fun onResponse(response: String) {
        // Show Toast
        Toast.makeText(this@VolleyPracticeActivity, "" + response, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(menuItem: MenuItem?): Boolean {
        ToolbarManager.setOptionsItemSelected(this, menuItem)
        return super.onOptionsItemSelected(menuItem)
    }
}