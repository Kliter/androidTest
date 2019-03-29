package com.test.TestApp.VolleyTest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.test.TestApp.R
import kotlinx.android.synthetic.main.fragment_volley_customrequestqueue.*
import kotlinx.android.synthetic.main.fragment_volley_customrequestqueue.view.*

class VolleyCustomRequestQueueFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_volley_customrequestqueue, container, false)
        view.btnSendRequest.setOnClickListener {

            // Instantiate the cache.
//            val cache = DiskBasedCache(Environment.getRootDirectory(), 1024 * 1024)

            // Setup the network to use HttpURLConnection as the HTTP client.
//            val network = BasicNetwork(HurlStack())

            // Instantiate the RequestQueue with the cache and network. Start the queue.
//            val requestQueue = RequestQueue(cache, network).apply {
//                start()
//            }

            val url = "http://www.example.com"

            // Formulate the request and handle the response.
            val stringRequest = StringRequest(
                    Request.Method.GET,
                    url,
                    Response.Listener {
                        tvResult.text = it
                    },
                    Response.ErrorListener {
                        tvResult.text = it.message
                    })

            RequestQueueProvider.getInstance(this.context!!).addToRequestQueue(stringRequest)

//            requestQueue.add(stringRequest)
        }



        return view
    }
}