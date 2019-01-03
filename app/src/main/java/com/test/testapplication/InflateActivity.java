package com.test.testapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class InflateActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    LayoutInflater inflater;
    boolean flag = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inflate);

        linearLayout = findViewById(R.id.linear_layout);

        TextView textView = findViewById(R.id.text);
        textView.setText(getText(R.string.contents));

        Button button = findViewById(R.id.btnExecute);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!flag) {
                    LayoutInflater inflater = getLayoutInflater();
                    inflater.inflate(R.layout.view_inflate, linearLayout, true);
                    flag = true;
                } else {
                    linearLayout.removeAllViews();
                    flag = false;
                }
            }
        });
    }
}
