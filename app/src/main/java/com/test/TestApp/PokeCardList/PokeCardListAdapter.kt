package com.test.TestApp.PokeCardList

import android.content.Context
import android.graphics.BitmapFactory
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.test.TestApp.R

class PokeCardListAdapter(
        private val context: Context,
        private val itemClickListener: PokeCardListViewHolder.ItemClickListener,
        private val pokeImageList: List<Int>,
        private val pokeNameList: List<String>,
        private val pokeDescription: List<String>
): androidx.recyclerview.widget.RecyclerView.Adapter<PokeCardListViewHolder>() {

    var mRecyclerView: androidx.recyclerview.widget.RecyclerView? = null

    override fun onAttachedToRecyclerView(recyclerView: androidx.recyclerview.widget.RecyclerView) {
        mRecyclerView = recyclerView
    }

    override fun onDetachedFromRecyclerView(recyclerView: androidx.recyclerview.widget.RecyclerView) {
        mRecyclerView = null
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeCardListViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.snippet_pokecardlist_item, parent, false)
        view.setOnClickListener {
            mRecyclerView?.let {
                itemClickListener.onItemClick(
                        view,
                        it.getChildAdapterPosition(view)
                )
            }
        }

        return PokeCardListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pokeImageList.size
    }

    override fun onBindViewHolder(holder: PokeCardListViewHolder, position: Int) {
        holder.let {
            it.ivPokeImage.setImageBitmap(BitmapFactory.decodeResource(context.resources, pokeImageList[position]))
            it.tvPokeName.text = pokeNameList[position]
            it.tvPokeDescription.text = pokeDescription[position]
        }
    }
}
