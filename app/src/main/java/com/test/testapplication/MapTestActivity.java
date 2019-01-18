package com.test.testapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

public class MapTestActivity extends AppCompatActivity {

    private static final String TAG = "MapTestActivity";
    private Context mContext;
    ImageView aButton, bButton, imgDisplay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: start MapTestActivity.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maptest);

        init();
        setOnClickListener();
    }

    private void init() {
        mContext = getApplication();
        aButton = (ImageView) findViewById(R.id.aButton);
        bButton = (ImageView) findViewById(R.id.bButton);
        imgDisplay = (ImageView) findViewById(R.id.imgDisplay);
    }

    private void setOnClickListener() {
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: aButton");
            }
        });
        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: bButton");
            }
        });
        imgDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: imgDisplay");
            }
        });
    }
}
