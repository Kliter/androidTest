package com.test.TestApp.RecyclerViewTest

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.test.TestApp.R

class RecyclerViewTestAdapter(
        private val context: Context,
        private val itemClickListener: RecyclerViewTestViewHolder.ItemClickListener,
        private val itemList: List<String>
) : RecyclerView.Adapter<RecyclerViewTestViewHolder>() {

    private var mRecyclerView: RecyclerView? = null

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        mRecyclerView = recyclerView
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        mRecyclerView = null
    }

    override fun onBindViewHolder(holder: RecyclerViewTestViewHolder, position: Int) {
        holder.let {
            it.itemTextView.text = itemList[position]
            it.itemImageView.setImageResource(R.mipmap.ic_launcher)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewTestViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val mView = layoutInflater.inflate(R.layout.snippet_recyclerview_item, parent, false)

        mView.setOnClickListener { view ->
            mRecyclerView?.let {
                itemClickListener.onItemClick(view, it.getChildAdapterPosition(view))
            }
        }

        return RecyclerViewTestViewHolder(mView)
    }
}
