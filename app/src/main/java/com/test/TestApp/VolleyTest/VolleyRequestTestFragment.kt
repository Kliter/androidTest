package com.test.TestApp.VolleyTest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.test.TestApp.R
import kotlinx.android.synthetic.main.fragment_volleyrequesttest.*
import kotlinx.android.synthetic.main.fragment_volleyrequesttest.view.*

class VolleyRequestTestFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_volleyrequesttest, container, false)

        view.btnSendRequest.setOnClickListener {
            val queue = Volley.newRequestQueue(activity)
            val url = "http://www.ekidata.jp/api/l/11302.xml"

            val stringRequest = StringRequest(
                    Request.Method.GET,
                    url,
                    Response.Listener<String> { response ->
                        tvResult.text = "Response is: ${response.substring(0, 500)}"
                    },
                    Response.ErrorListener {
                        tvResult.text = "That didn't work!"
                    })

            queue.add(stringRequest)
        }

        return view
    }
}