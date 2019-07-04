package com.test.testapp.volleytest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.test.testapp.R
import kotlinx.android.synthetic.main.fragment_volley_testbuttons.view.*

class VolleyTestButtonsFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_volley_testbuttons, container, false)
        view.btnRequestTest.setOnClickListener {
            fragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.volleyTestContainer, VolleyRequestFragment())
                    ?.addToBackStack(null)
                    ?.commit()
        }
        view.btnUseCustomRequestQueue.setOnClickListener {
            fragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.volleyTestContainer, VolleyCustomRequestQueueFragment())
                    ?.addToBackStack(null)
                    ?.commit()
        }
        view.btnMakeStandardRequest.setOnClickListener {
            fragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.volleyTestContainer, VolleyMakeStandardRequestFragment())
                    ?.addToBackStack(null)
                    ?.commit()
        }

        return view
    }
}
