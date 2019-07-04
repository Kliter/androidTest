package com.test.testapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.test.testapp.customdialogtest.CustomDialogTestActivity
import com.test.testapp.dagger2test.Dagger2TestActivity
import com.test.testapp.databindingtest.DataBindingTestActivity
import com.test.testapp.dialogstest.DialogsTestActivity
import com.test.testapp.firebasetest.FirebaseTestActivity
import com.test.testapp.glidetest.GlideTestActivity
import com.test.testapp.googlemaptest.GoogleMapTestActivity
import com.test.testapp.listviewtest.ListViewTestActivity
import com.test.testapp.materialsearchviewtest.MaterialSearchViewTestActivity
import com.test.testapp.navigationdrawertest.NavigationDrawerTestActivity
import com.test.testapp.okhttptest.OkHttpTestActivity
import com.test.testapp.permissionchecktest.PermissionCheckTestActivity
import com.test.testapp.pokecardlist.PokeCardListActivity
import com.test.testapp.prefecturelistview.PrefectureActivity
import com.test.testapp.recyclerviewtest.RecyclerViewTestActivity
import com.test.testapp.sqlitetest.SQLiteTestActivity
import com.test.testapp.setsoftinputmodetest.SetSoftInputModeTestActivity
import com.test.testapp.textinputtest.TextInputTestActivity
import com.test.testapp.util.BottomNavigationViewManager
import com.test.testapp.util.ToolbarManager
import com.test.testapp.volleypractice.VolleyPracticeActivity
import com.test.testapp.volleytest.VolleyTestActivity
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
        btnDataBindingTest.setOnClickListener(this)
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
            R.id.btnDataBindingTest -> {
                intent.setClass(this, DataBindingTestActivity::class.java)
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