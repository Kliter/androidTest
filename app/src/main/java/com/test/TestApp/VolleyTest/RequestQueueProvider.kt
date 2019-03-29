package com.test.TestApp.VolleyTest

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class RequestQueueProvider constructor(context: Context) {

    companion object {
        @Volatile
        private var INSTANCE: RequestQueueProvider? = null
                fun getInstance(context: Context) =
                    INSTANCE ?: synchronized(this) {
                        INSTANCE ?: RequestQueueProvider(context).also {
                            INSTANCE = it
                        }
                    }
    }

    val requestQueue: RequestQueue by lazy {
        // ApplicationContext is key, it keeps you form leaking the
        // Activity or BroadcastReceiver if someone passes one in.
        Volley.newRequestQueue(context.applicationContext)
    }

    fun <T> addToRequestQueue(req: Request<T>) {
        requestQueue.add(req)
    }

}