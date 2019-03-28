package com.test.TestApp.VolleyTest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.test.TestApp.R
import kotlinx.android.synthetic.main.fragment_volleytestbuttons.view.*

class VolleyTestButtonsFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_volleytestbuttons, container, false)
        view.btnRequestTest.setOnClickListener {
            fragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.volleyTestContainer, VolleyRequestTestFragment())
                    ?.addToBackStack(null)
                    ?.commit()
        }
        return view
    }
}
