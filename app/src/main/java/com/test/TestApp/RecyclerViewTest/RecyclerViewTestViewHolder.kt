package com.test.TestApp.RecyclerViewTest

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.snippet_recyclerview_item.view.*

class RecyclerViewTestViewHolder(view: View): RecyclerView.ViewHolder(view) {

    interface ItemClickListener {
        fun onItemClick(view: View, position: Int)
    }

    val itemTextView: TextView = view.tvCardText
    val itemImageView: ImageView = view.ivCardIcon
}