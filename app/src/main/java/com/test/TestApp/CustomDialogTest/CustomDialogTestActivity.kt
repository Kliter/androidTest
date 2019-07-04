package com.test.testapp.customdialogtest

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.test.testapp.R

class CustomDialogTestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customdialogtest)
    }

    fun launch(view: View) {
        var fragment: DialogFragment? = null

        if (view.id == R.id.btnLaunchCustomDialog) {
            fragment = CustomDialogFragment()
        }

        if (fragment != null) {
            fragment.show(supportFragmentManager, "launch")
        }
    }
}