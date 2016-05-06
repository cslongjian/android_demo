package com.chenlong.touchpassing.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by supwin_mbp002 on 16/5/6.
 */
public class CLLineaLayout extends LinearLayout {

    public CLLineaLayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                System.out.println("CLLinreaLayout---dispatchTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("CLLinreaLayout---dispatchTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("CLLinreaLayout---dispatchTouchEvent---UP");
                break;
            default:
                break;
        }

        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                System.out.println("CLLinreaLayout---onTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("CLLinreaLayout---onTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("CLLinreaLayout---onTouchEvent---UP");
                break;
            default:
                break;
        }

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                System.out.println("CLLinreaLayout---onInterceptTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("CLLinreaLayout---onInterceptTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("CLLinreaLayout---onInterceptTouchEvent---UP");
                break;
            default:
                break;
        }
        return true;
//        return super.onInterceptTouchEvent(event);
    }
}
