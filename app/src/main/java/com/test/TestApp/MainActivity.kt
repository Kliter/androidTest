package com.test.TestApp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
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

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToolbarManager.setupToolbar(this, app_bar)
        bottomNavigationView.selectedItemId = R.id.action_home
        BottomNavigationViewManager.setupBottomNavigationView(this, bottomNavigationView)
        setupWidget()
    }

    private fun setupWidget() {
        btnListViewTest.setOnClickListener {
            val intent = Intent(this, ListViewTestActivity::class.java)
            startActivity(intent)
        }
        btnPrefectureListView.setOnClickListener {
            val intent = Intent(this, PrefectureActivity::class.java)
            startActivity(intent)
        }
        btnRecyclerViewTest.setOnClickListener {
            val intent = Intent(this, RecyclerViewTestActivity::class.java)
            startActivity(intent)
        }
        btnPokeCardList.setOnClickListener {
            val intent = Intent(this, PokeCardListActivity::class.java)
            startActivity(intent)
        }
        btnTextInputTest.setOnClickListener {
            val intent =  Intent(this, TextInputTestActivity::class.java)
            startActivity(intent)
        }
        btnVolleyTest.setOnClickListener {
            val intent = Intent(this, VolleyTestActivity::class.java)
            startActivity(intent)
        }
        btnVolleyPractice.setOnClickListener {
            val intent = Intent(this, VolleyPracticeActivity::class.java)
            startActivity(intent)
        }
        btnSQLiteTest.setOnClickListener {
            val intent = Intent(this, SQLiteTestActivity::class.java)
            startActivity(intent)
        }
        btnDialogsTest.setOnClickListener {
            val intent = Intent(this, DialogsTestActivity::class.java)
            startActivity(intent)
        }
        btnCustomDialogsTest.setOnClickListener {
            val intent = Intent(this, CustomDialogTestActivity::class.java)
            startActivity(intent)
        }
        btnMaterialSearchViewTest.setOnClickListener {
            val intent = Intent(this, MaterialSearchViewTestActivity::class.java)
            startActivity(intent)
        }
        btnGlideTest.setOnClickListener {
            val intent = Intent(this, GlideTestActivity::class.java)
            startActivity(intent)
        }
        btnSetSoftInputModeTest.setOnClickListener {
            val intent = Intent(this, SetSoftInputModeTestActivity::class.java)
            startActivity(intent)
        }
        btnPermissionCheckTest.setOnClickListener {
            val intent = Intent(this, PermissionCheckTestActivity::class.java)
            startActivity(intent)
        }
        btnFirebaseTest.setOnClickListener {
            val intent = Intent(this, FirebaseTestActivity::class.java)
            startActivity(intent)
        }
        btnGoogleMapTest.setOnClickListener {
            val intent = Intent(this, GoogleMapTestActivity::class.java)
            startActivity(intent)
        }
        btnNavigationDrawerTest.setOnClickListener {
            val intent = Intent(this, NavigationDrawerTestActivity::class.java)
            startActivity(intent)
        }
        btnOkHttpTest.setOnClickListener {
            val intent = Intent(this, OkHttpTestActivity::class.java)
            startActivity(intent)
        }
        btnDagger2Test.setOnClickListener {
            val intent = Intent(this, Dagger2TestActivity::class.java)
            startActivity(intent)
        }
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