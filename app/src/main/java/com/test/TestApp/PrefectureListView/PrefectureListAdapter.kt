package com.test.testapp.prefecturelistview

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.test.testapp.R
import kotlinx.android.synthetic.main.snippet_prefecture_item.view.*

class PrefectureListAdapter(context: Context, prefectureListItemDataList: List<PrefectureListItemData>):
        ArrayAdapter<PrefectureListItemData>(context, 0, prefectureListItemDataList) {

    private val mInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView


        if (view == null) {
            view = mInflater.inflate(R.layout.snippet_prefecture_item, parent, false)
        }
        val holder = PrefectureListViewHolder(
                view?.ivPrefectureIcon!!,
                view.tvPrefectureName!!,
                view.tvPrefectureDescription!!
        )

        val item = getItem(position) as PrefectureListItemData
        holder.ivPrefectureIcon.setImageBitmap(BitmapFactory.decodeResource(context.resources, item.prefectureIcon))
        holder.tvPrefectureName.text = item.prefectureName
        holder.tvPrefectureDescription.text = item.prefectureDescription
        return view
    }
}