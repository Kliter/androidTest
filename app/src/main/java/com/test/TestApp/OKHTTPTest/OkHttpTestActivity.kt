package com.test.testapp.okhttptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.testapp.R
import kotlinx.android.synthetic.main.activity_ok_http_test.*
import okhttp3.*
import java.io.IOException

class OkHttpTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ok_http_test)

        val client = OkHttpClient()
        val url = "http://weather.livedoor.com/forecast/webservice/json/v1?city=130010"

        val request: Request = Request.Builder().url(url).build()

        client.newCall(request).enqueue(object: Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    val myResponse: String = response.body?.string()!!
                    this@OkHttpTestActivity.runOnUiThread {
                        text_view_result.text = myResponse
                    }
                }
            }
        })
    }
}
