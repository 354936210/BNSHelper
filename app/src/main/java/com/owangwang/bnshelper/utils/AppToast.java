package com.owangwang.bnshelper.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by wangchao on 2018/2/24.
 */

public class AppToast {
    private static Toast toast;
    public static void showShortToast(Context context,String content){
        if (context==null){
            return;
        }
        if (toast!=null)
            toast.cancel();
        toast=Toast.makeText(context,content,Toast.LENGTH_SHORT);
        toast.show();
    }
    public static void showLongToast(Context context,String content){
        if (context==null)
            return;
        if (toast!=null)
            toast.cancel();
        toast=Toast.makeText(context,content,Toast.LENGTH_LONG);
        toast.show();
    }
}
