package com.owangwang.bnshelper.start;

import android.app.Activity;

import java.util.Stack;

/**
 * Created by wangchao on 2018/2/24.
 * @author wangchao
 * --管理Activity的工具类
 */

public class ActivityManager {
    private static Stack<Activity> activityStack;
    private static ActivityManager instance;
    private ActivityManager(){}
    public static ActivityManager getManager(){
        if (instance==null){
            instance=new ActivityManager();
        }
        return instance;
    }

    public void addActivity(Activity activity){
        if (activityStack==null){
            activityStack=new Stack<Activity>();
        }
        activityStack.add(activity);
    }
    public void finishActivity() {
        Activity activity = activityStack.lastElement();
        finishActivity(activity);
    }
    public void finishActivity(Class<?> cls) {
        for (Activity activity : activityStack) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
                break;
            }
        }
    }

    public void finishActivity(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            activityStack.remove(activity);
            activity.finish();
            activity = null;
        }
    }


}
