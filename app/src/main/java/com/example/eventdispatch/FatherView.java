package com.example.eventdispatch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by libo on 2017/12/11.
 */

public class FatherView extends RelativeLayout{

    public FatherView(Context context) {
        super(context);
    }

    public FatherView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TAG","FatherView  :  onTouchEvent  " + ParseEventStr.parseEventStr(event.getAction()));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("TAG","FatherView  :  dispatchTouchEvent  " + ParseEventStr.parseEventStr(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("TAG","FatherView  :  onInterceptTouchEvent  " + ParseEventStr.parseEventStr(ev.getAction()));
        return true;
    }
}
