package com.test.testapp.recyclerviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.test.testapp.R

class RecyclerViewTestAdapter(
        private val context: Context,
        private val itemClickListener: RecyclerViewTestViewHolder.ItemClickListener,
        private val itemList: List<String>
) : androidx.recyclerview.widget.RecyclerView.Adapter<RecyclerViewTestViewHolder>() {

    private var mRecyclerView: androidx.recyclerview.widget.RecyclerView? = null

    override fun onAttachedToRecyclerView(recyclerView: androidx.recyclerview.widget.RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        mRecyclerView = recyclerView
    }

    override fun onDetachedFromRecyclerView(recyclerView: androidx.recyclerview.widget.RecyclerView) {
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
