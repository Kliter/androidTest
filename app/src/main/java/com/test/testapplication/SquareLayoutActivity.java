package com.test.testapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SquareLayoutActivity extends AppCompatActivity {

    private static final String TAG = "SquareLayoutActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: start SquareLayoutActivity.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squareconstraintlayout);
    }
}
