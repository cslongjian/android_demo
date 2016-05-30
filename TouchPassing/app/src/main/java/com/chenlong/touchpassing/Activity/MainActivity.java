package com.chenlong.touchpassing.Activity;

import android.app.ActivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import com.chenlong.touchpassing.R;
import com.chenlong.touchpassing.widget.CLButton;
import com.chenlong.touchpassing.widget.CLLineaLayout;

public class MainActivity extends AppCompatActivity {

    private CLButton button;
    private CLButton singleBtn;
    private CLLineaLayout lineaLayout;

    Activitym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lineaLayout = (CLLineaLayout) findViewById(R.id.linearlayout);
        lineaLayout.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        System.out.println("CLLineaLayout---onTouch---DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        System.out.println("CLLineaLayout---onTouch---MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        System.out.println("CLLineaLayout---onTouch---UP");
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
        lineaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("CLLineaLayout clicked!");
            }
        });

        button = (CLButton) findViewById(R.id.btn);
        button.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        System.out.println("CLButton---onTouch---DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        System.out.println("CLButton---onTouch---MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        System.out.println("CLButton---onTouch---UP");
//                        return true;
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("CLButton clicked!");
                System.out.println("整个点击事件按钮完毕!");
            }
        });


        singleBtn = (CLButton) findViewById(R.id.singlebtn);
        singleBtn.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        System.out.println("CLButton---onTouch---DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        System.out.println("CLButton---onTouch---MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        System.out.println("CLButton---onTouch---UP");
//                        return true;
//                        break;
                    default:
                        break;
                }
                return false;
            }
        });
        singleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("CLButton clicked!");
                System.out.println("整个点击事件按钮完毕!");
            }
        });

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("Activity---dispatchTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("Activity---dispatchTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("Activity---dispatchTouchEvent---UP");
                break;
            default:
                break;
        }

//        return true;
        return super.dispatchTouchEvent(event);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("Activity---onTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("Activity---onTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("Activity---onTouchEvent---UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }
}
