package com.test.TestApp.VolleyTest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.test.TestApp.R
import kotlinx.android.synthetic.main.fragment_volley_makestandardrequest.*
import kotlinx.android.synthetic.main.fragment_volley_makestandardrequest.view.*

class VolleyMakeStandardRequestFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_volley_makestandardrequest, container, false)
        view.btnSendRequest.setOnClickListener {
            val url = "http://my-json-feed"
            val jsonObjectRequest = JsonObjectRequest(
                    Request.Method.GET,
                    url,
                    null,
                    Response.Listener { response ->
                        tvResult.text = "Response: %s".format(response.toString())
                    },
                    Response.ErrorListener {
                        tvResult.text = "It isn't working!!"
                    }
            )

            RequestQueueProvider.getInstance(context!!).addToRequestQueue(jsonObjectRequest)
        }

        return view
    }
}