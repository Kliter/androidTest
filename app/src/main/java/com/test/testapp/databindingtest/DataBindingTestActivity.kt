package com.test.testapp.databindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.test.testapp.R
import com.test.testapp.databinding.ActivityDataBindingBinding

class DataBindingTestActivity : AppCompatActivity(), EventHandlers {

    companion object {
        private const val TAG = "DataBindingTestActivity"
    }

    private var mUser = User("KL")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_data_binding)

        val binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding)
        // If packages name begins Uppercase, It will be error.
        binding.user = mUser
        binding.handlers = this
    }

    override fun onChangeClick(view: View) {
        Log.d(TAG, "Change UserName")
        mUser.name = "LK"
    }
}
