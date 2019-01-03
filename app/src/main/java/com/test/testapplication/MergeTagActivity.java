package com.test.testapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MergeTagActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button btnBad, btnGood;
    LayoutInflater inflater;
    boolean viewFlg = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mergetag);

        init();
    }

    private void init() {
        inflater = getLayoutInflater();

        setObject();
        setOnClickListener();
    }

    private void setObject() {
        linearLayout = findViewById(R.id.linLayout1);
        btnBad = findViewById(R.id.btnBad);
        btnGood = findViewById(R.id.btnGood);
    }

    private void setOnClickListener() {
        btnBad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inflater.inflate(R.layout.view_mergetag_bad, linearLayout);
            }
        });

        btnGood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inflater.inflate(R.layout.view_mergetag_good, linearLayout);
            }
        });
    }
}
