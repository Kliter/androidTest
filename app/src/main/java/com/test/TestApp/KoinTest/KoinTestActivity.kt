package com.test.testapp.kointest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.test.testapp.R
import org.koin.android.ext.android.inject

class KoinTestActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "KoinTestActivity"
    }

    private val viewModel: MainViewModelContract by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin_test)

        Log.d(TAG, "${this.viewModel.greet()}")
    }
}
