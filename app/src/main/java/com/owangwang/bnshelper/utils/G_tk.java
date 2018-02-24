package com.owangwang.bnshelper.utils;

/**
 * Created by wangchao on 2018/2/24.
 */

public class G_tk {
    public static String getG_tk(String pskey){
        char[] pskeyArray=pskey.toCharArray();
        long hash = 5381;
        for (int i = 0; i <pskeyArray.length; i++)
        {
            hash += (hash << 5) + pskeyArray[i];
        }
        long g_tk = hash & 0x7fffffff;
        return g_tk+"";
    }
}
