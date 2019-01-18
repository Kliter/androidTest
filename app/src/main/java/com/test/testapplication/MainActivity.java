package com.test.testapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnInflate, btnMergeTag, btnSquareLayout, btnMapTest;
    private Context mContext;
    private Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setOnClickListener();
    }

    private void init() {
        mContext = MainActivity.this;

        setObject();
        setOnClickListener();
    }

    private void setObject() {
        btnInflate = findViewById(R.id.btnInflate);
        btnMergeTag = findViewById(R.id.btnMergeTag);
        btnSquareLayout = findViewById(R.id.btnSquareLayout);
        btnMapTest = findViewById(R.id.btnMapTest);
    }

    private void setOnClickListener() {
        btnInflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(mContext, InflateActivity.class);
                startActivity(intent);
            }
        });
        btnMergeTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setClass(mContext, MergeTagActivity.class);
                startActivity(intent);
            }
        });
        btnSquareLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setClass(mContext, SquareLayoutActivity.class);
                startActivity(intent);
            }
        });
        btnMapTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setClass(mContext, MapTestActivity.class);
                startActivity(intent);
            }
        });
    }
}
