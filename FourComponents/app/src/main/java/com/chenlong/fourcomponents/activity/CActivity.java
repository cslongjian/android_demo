package com.chenlong.fourcomponents.activity;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.chenlong.fourcomponents.R;

import java.util.ArrayList;
import java.util.List;

public class CActivity extends AppCompatActivity {

    private Context context;
    private Button btnA;
    private Button btnB;
    private Button btnC;
    private Button btn_TOP;
    private Button btn_INSTANCE;
    private Button btn_TASK;
    private ActivityManager activityManager;
    List<ActivityManager.RunningTaskInfo> runningTaskInfos = new ArrayList<ActivityManager.RunningTaskInfo>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        context = this;
        activityManager = (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);
        runningTaskInfos = activityManager.getRunningTasks(1);
//        if(runningTaskInfos != null){
//            for (int i = 0 ; i < runningTaskInfos.size(); i++)
//            {
//                ActivityManager.RunningTaskInfo info =  runningTaskInfos.get(i);
//                String name = info.topActivity.getClassName();
//                Log.w("tag-topActivity",name);
//                Log.w("tag-baseActivity", info.baseActivity.getClassName());
//
//            }
//        }

        btnA = (Button)findViewById(R.id.btn_a);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainActivity.class);
                context.startActivity(intent);
            }
        });

        btnB = (Button)findViewById(R.id.btn_b);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,BActivity.class);
                context.startActivity(intent);
            }
        });

        btnC = (Button)findViewById(R.id.btn_c);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,CActivity.class);
                context.startActivity(intent);
            }
        });

        btn_TOP = (Button)findViewById(R.id.btn_top);
        btn_TOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SingleTopActivity.class);
                context.startActivity(intent);
            }
        });

        btn_TASK = (Button)findViewById(R.id.btn_task);
        btn_TASK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SingleTaskActivity.class);
                context.startActivity(intent);
            }
        });

        btn_INSTANCE = (Button)findViewById(R.id.btn_instance);
        btn_INSTANCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SingleInstanceActivity.class);
                context.startActivity(intent);
            }
        });

    }
    @Override
    protected void onResume() {
        super.onResume();
        activityManager = (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);
        runningTaskInfos = activityManager.getRunningTasks(1);
        if(runningTaskInfos != null){
            for (int i = 0 ; i < runningTaskInfos.size(); i++)
            {
                ActivityManager.RunningTaskInfo info =  runningTaskInfos.get(i);
                String name = info.topActivity.getClassName();
                Log.w("tag-topActivity",name);
                Log.w("tag-baseActivity", info.baseActivity.getClassName());

            }
        }
    }

}
