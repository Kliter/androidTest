package com.test.TestApp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.test.TestApp.CustomDialogTest.CustomDialogTestActivity
import com.test.TestApp.Dagger2Test.Dagger2TestActivity
import com.test.TestApp.DialogsTest.DialogsTestActivity
import com.test.TestApp.FirebaseTest.FirebaseTestActivity
import com.test.TestApp.GlideTest.GlideTestActivity
import com.test.TestApp.GoogleMapTest.GoogleMapTestActivity
import com.test.TestApp.ListViewTest.ListViewTestActivity
import com.test.TestApp.MaterialSearchViewTest.MaterialSearchViewTestActivity
import com.test.TestApp.NavigationDrawerTest.NavigationDrawerTestActivity
import com.test.TestApp.OKHTTPTest.OkHttpTestActivity
import com.test.TestApp.PermissionCheckTest.PermissionCheckTestActivity
import com.test.TestApp.PokeCardList.PokeCardListActivity
import com.test.TestApp.PrefectureListView.PrefectureActivity
import com.test.TestApp.RecyclerViewTest.RecyclerViewTestActivity
import com.test.TestApp.SQLiteTest.SQLiteTestActivity
import com.test.TestApp.SetSoftInputModeTest.SetSoftInputModeTestActivity
import com.test.TestApp.TextInputTest.TextInputTestActivity
import com.test.TestApp.Util.BottomNavigationViewManager
import com.test.TestApp.Util.ToolbarManager
import com.test.TestApp.VolleyPractice.VolleyPracticeActivity
import com.test.TestApp.VolleyTest.VolleyTestActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToolbarManager.setupToolbar(this, app_bar)
        bottomNavigationView.selectedItemId = R.id.action_home
        BottomNavigationViewManager.setupBottomNavigationView(this, bottomNavigationView)
        setupWidget()
    }

    private fun setupWidget() {
        btnListViewTest.setOnClickListener(this)
        btnPrefectureListView.setOnClickListener(this)
        btnRecyclerViewTest.setOnClickListener(this)
        btnPokeCardList.setOnClickListener(this)
        btnTextInputTest.setOnClickListener(this)
        btnVolleyTest.setOnClickListener(this)
        btnVolleyPractice.setOnClickListener(this)
        btnSQLiteTest.setOnClickListener(this)
        btnDialogsTest.setOnClickListener(this)
        btnCustomDialogsTest.setOnClickListener(this)
        btnMaterialSearchViewTest.setOnClickListener(this)
        btnGlideTest.setOnClickListener(this)
        btnSetSoftInputModeTest.setOnClickListener(this)
        btnPermissionCheckTest.setOnClickListener(this)
        btnFirebaseTest.setOnClickListener(this)
        btnGoogleMapTest.setOnClickListener(this)
        btnNavigationDrawerTest.setOnClickListener(this)
        btnOkHttpTest.setOnClickListener(this)
        btnDagger2Test.setOnClickListener(this)
        btnKoinTest.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = Intent()
        when (view.id) {
            R.id.btnListViewTest -> {
                intent.setClass(this, ListViewTestActivity::class.java)
            }
            R.id.btnPrefectureListView -> {
                intent.setClass(this, PrefectureActivity::class.java)
            }
            R.id.btnRecyclerViewTest -> {
                intent.setClass(this, RecyclerViewTestActivity::class.java)
            }
            R.id.btnPokeCardList -> {
                intent.setClass(this, PokeCardListActivity::class.java)
            }
            R.id.btnTextInputTest -> {
                intent.setClass(this, TextInputTestActivity::class.java)
            }
            R.id.btnVolleyTest -> {
                intent.setClass(this, VolleyTestActivity::class.java)
            }
            R.id.btnVolleyPractice -> {
                intent.setClass(this, VolleyPracticeActivity::class.java)
            }
            R.id.btnSQLiteTest -> {
                intent.setClass(this, SQLiteTestActivity::class.java)
            }
            R.id.btnDialogsTest -> {
                intent.setClass(this, DialogsTestActivity::class.java)
            }
            R.id.btnCustomDialogsTest -> {
                intent.setClass(this, CustomDialogTestActivity::class.java)
            }
            R.id.btnMaterialSearchViewTest -> {
                intent.setClass(this, MaterialSearchViewTestActivity::class.java)
            }
            R.id.btnGlideTest -> {
                intent.setClass(this, GlideTestActivity::class.java)
            }
            R.id.btnSetSoftInputModeTest -> {
                intent.setClass(this, SetSoftInputModeTestActivity::class.java)
            }
            R.id.btnPermissionCheckTest -> {
                intent.setClass(this, PermissionCheckTestActivity::class.java)
            }
            R.id.btnFirebaseTest -> {
                intent.setClass(this, FirebaseTestActivity::class.java)
            }
            R.id.btnGoogleMapTest -> {
                intent.setClass(this, GoogleMapTestActivity::class.java)
            }
            R.id.btnNavigationDrawerTest -> {
                intent.setClass(this, NavigationDrawerTestActivity::class.java)
            }
            R.id.btnOkHttpTest -> {
                intent.setClass(this, OkHttpTestActivity::class.java)
            }
            R.id.btnDagger2Test -> {
                intent.setClass(this, Dagger2TestActivity::class.java)
            }
            R.id.btnKoinTest -> {
                intent.setClass(this, Dagger2TestActivity::class.java)
            }
        }
        startActivity(intent)
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