package com.chenlong.touchpassing.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.Button;

/**
 * Created by supwin_mbp002 on 16/5/4.
 */
public class CLButton extends Button {

    public CLButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("CLButton---dispatchTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("CLButton---dispatchTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("CLButton---dispatchTouchEvent---UP");
                break;
            default:
                break;
        }

        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("CLButton---onTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("CLButton---onTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("CLButton---onTouchEvent---UP");
//                return false;
                break;
            default:
                break;
        }

        return super.onTouchEvent(event);
    }

}
