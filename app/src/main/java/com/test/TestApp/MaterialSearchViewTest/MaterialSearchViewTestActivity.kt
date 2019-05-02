package com.test.TestApp.MaterialSearchViewTest

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import com.miguelcatalan.materialsearchview.MaterialSearchView
import com.test.TestApp.R
import kotlinx.android.synthetic.main.activity_materialsearchviewtest.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class MaterialSearchViewTestActivity : AppCompatActivity() {

    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null
    private var mViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materialsearchviewtest)
        setupWidget()
    }

    private fun setupWidget() {
        setSupportActionBar(app_bar)

        // Setup the ViewPager with the sections adapter.
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        mViewPager = container
        mViewPager?.adapter = mSectionsPagerAdapter
        tabLayout.setupWithViewPager(mViewPager)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
        }

        val searchView = MaterialSearchView(this)
        searchView.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val viewGroup: ViewGroup = toolbar_layout
        viewGroup.addView(searchView)

        searchView.setOnQueryTextListener(object : MaterialSearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                return false
            }
        })
        searchView.setOnSearchViewListener(object : MaterialSearchView.SearchViewListener {
            override fun onSearchViewClosed() {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onSearchViewShown() {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_search, menu)
        if (menu != null) {
            val item: MenuItem = menu.findItem(R.id.action_search)
            searchView.setMenuItem(item)
        }
        return true
    }
}