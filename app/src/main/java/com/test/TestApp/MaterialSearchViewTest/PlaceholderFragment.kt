package com.test.TestApp.MaterialSearchViewTest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.test.TestApp.R
import kotlinx.android.synthetic.main.fragment_tab.view.*

class PlaceholderFragment: Fragment() {
    companion object {
        private const val ARGS_SECTION_NUMBER = "section_number"

        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            val fragment = PlaceholderFragment()
            val args = Bundle()
            args.putInt(ARGS_SECTION_NUMBER, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_tab, container, false)
        view.sectionLabel.text = getString(R.string.SectionFormat, arguments?.getInt(ARGS_SECTION_NUMBER))
        return view
    }
}