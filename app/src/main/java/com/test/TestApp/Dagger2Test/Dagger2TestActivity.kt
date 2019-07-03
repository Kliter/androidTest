package com.test.TestApp.Dagger2Test

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.test.TestApp.R
import javax.inject.Inject

class Dagger2TestActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "Dagger2TestActivity"
    }

    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger2_test)

        component().inject(this)

        if (context != null) {
            Log.d(TAG, "context: $context")
        }
    }
}
