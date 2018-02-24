package com.owangwang.bnshelper.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.owangwang.bnshelper.start.ActivityManager;

/**
 * Created by wangchao on 2018/2/24.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityManager.getManager().addActivity(this);
        // 设置 状态栏颜色
    }
}
