package com.test.TestApp.RecyclerViewTest

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.snippet_recyclerview_item.view.*

class RecyclerViewTestViewHolder(view: View): androidx.recyclerview.widget.RecyclerView.ViewHolder(view) {

    interface ItemClickListener {
        fun onItemClick(view: View, position: Int)
    }

    val itemTextView: TextView = view.tvCardText
    val itemImageView: ImageView = view.ivCardIcon
}