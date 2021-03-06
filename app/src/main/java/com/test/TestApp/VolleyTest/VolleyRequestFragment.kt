package com.test.testapp.volleytest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.test.testapp.R
import kotlinx.android.synthetic.main.fragment_volley_request.*
import kotlinx.android.synthetic.main.fragment_volley_request.view.*

class VolleyRequestFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_volley_request, container, false)

        view.btnSendRequest.setOnClickListener {
            val queue = Volley.newRequestQueue(activity)
            val url = "http://www.google.com"

            val stringRequest = StringRequest(
                    Request.Method.GET,
                    url,
                    Response.Listener<String> {
                        tvResult.text = it
                    },
                    Response.ErrorListener {
                        tvResult.text = "That didn't work!"
                    })

            queue.add(stringRequest)
        }

        return view
    }
}