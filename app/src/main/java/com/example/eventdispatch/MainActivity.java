package com.example.eventdispatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("TAG", "MainActivity  :  dispatchTouchEvent  " + ParseEventStr.parseEventStr(event.getAction()));
        return super.dispatchTouchEvent(event);
    }

    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TAG", "MainActivity  :  onTouchEvent  " + ParseEventStr.parseEventStr(event.getAction()));
        return super.onTouchEvent(event);
    }
}
