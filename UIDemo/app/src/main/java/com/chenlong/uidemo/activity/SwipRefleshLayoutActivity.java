package com.chenlong.uidemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.chenlong.uidemo.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Created by supwin_mbp002 on 16/5/17.
 */
public class SwipRefleshLayoutActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener {

    private static final int REFRESH_COMPLETE = 0X110;
    private SwipeRefreshLayout refreshLayout;
    private ListView mListView;
    private ArrayAdapter<String> mAdapter;
    private List<String> mDatas = new ArrayList<String>(Arrays.asList("Java", "Javascript", "C++", "Ruby", "Json",
            "HTML"));

    private int markRefleshTime= 0 ;


    private Handler mHandler = new Handler()
    {
        public void handleMessage(android.os.Message msg)
        {
            switch (msg.what)
            {
                case REFRESH_COMPLETE:
                    Log.w("tag","刷新完成");
                    markRefleshTime = markRefleshTime+1;
                    mDatas.add(""+markRefleshTime);
                    mAdapter.notifyDataSetChanged();
                    refreshLayout.setRefreshing(false);
                    break;

            }
        };
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);


        refreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeLayout);

        refreshLayout.setOnRefreshListener(this);

        mListView = (ListView)findViewById(R.id.list);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mDatas);
        mListView.setAdapter(mAdapter);

    }

    @Override
    public void onRefresh() {
        Log.w("tag","刷新控件");
        mHandler.sendEmptyMessageDelayed(REFRESH_COMPLETE, 2000);
    }
}
