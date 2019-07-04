package com.test.testapp.listviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.test.testapp.R
import kotlinx.android.synthetic.main.snippet_listview_item.view.*

class ListViewTestAdapter(context: Context, val listViewTestItemList: List<ListViewTestItemData>):
        ArrayAdapter<ListViewTestItemData>(context, 0, listViewTestItemList) {
    private val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val holder: ListViewTestViewHolder

        if (view == null) {
            view = layoutInflater.inflate(R.layout.snippet_listview_item, parent, false)
            holder = ListViewTestViewHolder(
                    view.tvUserName,
                    view.tvDescription
            )

            view.tag = holder
        }
        else {
            holder = view.tag as ListViewTestViewHolder
        }

        val item = getItem(position) as ListViewTestItemData
        holder.tvUserName.text = item.name
        holder.tvDescription.text = item.description
        return view!!
    }
}
