package com.test.testapp.dagger2test

import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.component(): ApplicationComponent = (application as Application).component