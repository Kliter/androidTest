package com.test.TestApp.CustomDialogTest

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.test.TestApp.R

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