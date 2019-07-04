package com.test.testapp.pokecardlist

import android.view.View
import kotlinx.android.synthetic.main.snippet_pokecardlist_item.view.*

class PokeCardListViewHolder(view: View): androidx.recyclerview.widget.RecyclerView.ViewHolder(view) {

    interface ItemClickListener {
        fun onItemClick(view: View, position: Int)
    }

    val ivPokeImage = view.ivPokeImage
    val tvPokeName = view.tvPokeName
    val tvPokeDescription = view.tvPokeDescription
}