package com.test.testapplication;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

public class DisplayImageView extends AppCompatImageView {

    private static final String TAG = "DisplayImageView";
    private static final int BOXNUM = 11;

    private float length, touchedX, touchedY;
    private Box[][] boxes = new Box[BOXNUM][BOXNUM];


    public DisplayImageView(Context context) {
        super(context);
        Log.d(TAG, "DisplayImageView: create.");
    }

    public DisplayImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "DisplayImageView: create.");
    }

    private void setBox() {
        for (int vert = 0; vert < BOXNUM; vert++) {
            for (int horiz = 0; horiz < BOXNUM; horiz++) {
                Box box = new Box(length, length);
                box.setX(box.getW() * horiz);
                box.setY(box.getH() * vert);
                boxes[vert][horiz] = box;
                Log.d(TAG, "setBox: X" + boxes[vert][horiz].getX());
                Log.d(TAG, "setBox: Y" + boxes[vert][horiz].getY());
            }
        }
        Log.d(TAG, "setBox: length" + length);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: touchedX = " + getX() + " / touchedY = " + getY());
        touchedX = event.getX();
        touchedY = event.getY();

        return super.onTouchEvent(event);
    }
}