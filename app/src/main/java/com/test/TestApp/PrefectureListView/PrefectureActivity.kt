package com.test.TestApp.PrefectureListView

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.test.TestApp.ListViewTest.ListViewTestActivity
import com.test.TestApp.PokeCardList.PokeCardListActivity
import com.test.TestApp.R
import com.test.TestApp.RecyclerViewTest.RecyclerViewTestActivity
import com.test.TestApp.TextInputTest.TextInputTestActivity
import kotlinx.android.synthetic.main.activity_prefecture_listview.*
import kotlinx.android.synthetic.main.snippet_toolbar.*

class PrefectureActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prefecture_listview)
        setupToolbar()

        val prefectureIcons: List<Int> = listOf(
                R.drawable.hokkaido_dousho,
                R.drawable.aomori_kensho,
                R.drawable.iwate_kensho,
                R.drawable.miyagi_kensho,
                R.drawable.akita_kensho,
                R.drawable.yamagata_kensho,
                R.drawable.fukushima_kensho,
                R.drawable.ibaraki_kensho,
                R.drawable.tochigi_kensho,
                R.drawable.gunma_monsho,
                R.drawable.saitama_kensho,
                R.drawable.chiba_kensho,
                R.drawable.tokyo_symbol,
                R.drawable.kanagawa_kensho,
                R.drawable.niigata_symbol,
                R.drawable.toyama_kensho,
                R.drawable.ishikawa_kenki,
                R.drawable.fukui_kensho,
                R.drawable.yamanashi_kensho,
                R.drawable.nagano_kensho,
                R.drawable.gifu_kensho,
                R.drawable.shizuoka_kensho,
                R.drawable.aichi_kensho,
                R.drawable.mie_kensho,
                R.drawable.shiga_kensho,
                R.drawable.kyoto_fusho,
                R.drawable.osaka_fusho,
                R.drawable.hyogo_kenki,
                R.drawable.nara_kensho,
                R.drawable.wakayama_kensho,
                R.drawable.tottori_kensho,
                R.drawable.shimane_kensho,
                R.drawable.okayama_kensho,
                R.drawable.hiroshima_kensho,
                R.drawable.yamaguchi_kensho,
                R.drawable.tokushima_kensho,
                R.drawable.kagawa_kensho,
                R.drawable.ehime_kenki,
                R.drawable.kochi_kensho,
                R.drawable.fukuoka_kensho,
                R.drawable.saga_symbol,
                R.drawable.nagasaki_kensho,
                R.drawable.kumamoto_kensho,
                R.drawable.oita_kisho,
                R.drawable.miyazaki_kensho,
                R.drawable.kagoshima_symbol,
                R.drawable.okinawa_kensho
        )
        val prefectureNames: List<String> = resources.getStringArray(R.array.prefectureName).toMutableList()
        val prefectureDescriptions: List<String> = resources.getStringArray(R.array.prefectureDescription).toMutableList()

        val listItems = List(prefectureNames.size) { i -> PrefectureListItemData(prefectureIcons[i], prefectureNames[i], prefectureDescriptions[i]) }

        val adapter = PrefectureListAdapter(this, listItems)
        prefectureListView.adapter = adapter
    }

    private fun setupToolbar() {
        val toolbar: Toolbar = app_bar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val intent = Intent()
        when (item?.itemId) {
            R.id.action_listviewtest -> {
                intent.setClass(this, ListViewTestActivity::class.java)
                startActivity(intent)
            }
            R.id.action_prefecture_listview -> {
                intent.setClass(this, ListViewTestActivity::class.java)
                startActivity(intent)
            }
            R.id.action_recyclerviewtest -> {
                intent.setClass(this, RecyclerViewTestActivity::class.java)
                startActivity(intent)
            }
            R.id.action_pokecardlist -> {
                intent.setClass(this, PokeCardListActivity::class.java)
                startActivity(intent)
            }
            R.id.action_textinput -> {
                intent.setClass(this, TextInputTestActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}