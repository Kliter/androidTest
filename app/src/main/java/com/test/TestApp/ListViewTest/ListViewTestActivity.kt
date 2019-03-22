package com.test.TestApp.ListViewTest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.test.TestApp.R
import kotlinx.android.synthetic.main.activity_listview.*

class ListViewTestActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val names: List<String> = listOf(
                "User1",
                "User2",
                "User3",
                "User4",
                "User5",
                "User6",
                "User7",
                "User8",
                "User9",
                "User10"
        )

        val descriptions: List<String>  = listOf(
                "オッス!!オラ悟空1!!",
                "オッス!!オラ悟空2!!",
                "オッス!!オラ悟空3!!",
                "オッス!!オラ悟空4!!",
                "オッス!!オラ悟空5!!",
                "オッス!!オラ悟空6!!",
                "オッス!!オラ悟空7!!",
                "オッス!!オラ悟空8!!",
                "オッス!!オラ悟空9!!",
                "オッス!!オラ悟空10!!"
        )

        val listItems = List(10) { i -> ListViewTestItemData(names[i], descriptions[i]) }

        val adapter = ListViewTestAdapter(this, listItems)
        listView.adapter = adapter
    }
}