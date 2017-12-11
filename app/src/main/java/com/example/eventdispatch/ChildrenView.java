package com.example.eventdispatch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by libo on 2017/12/11.
 */

public class ChildrenView extends RelativeLayout{

    public ChildrenView(Context context) {
        super(context);
    }

    public ChildrenView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TAG","ChildrenView  :  onTouchEvent  " + ParseEventStr.parseEventStr(event.getAction()));
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("TAG","ChildrenView  :  dispatchTouchEvent  " + ParseEventStr.parseEventStr(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("TAG","ChildrenView  :  onInterceptTouchEvent  " + ParseEventStr.parseEventStr(ev.getAction()));
        return super.onInterceptTouchEvent(ev);
    }

}
