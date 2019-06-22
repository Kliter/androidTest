package com.test.TestApp.FirebaseTest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.TestApp.R
import kotlinx.android.synthetic.main.activity_firebasetest.*

class FirebaseTestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firebasetest)

        btnLoginTest.setOnClickListener {
            val intent = Intent(this, LoginTestActivity::class.java)
            startActivity(intent)
        }
    }
}