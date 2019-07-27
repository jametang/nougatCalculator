package com.southwest.calculator;

import android.app.Application;

import com.tencent.bugly.Bugly;
import com.tencent.stat.StatConfig;
import com.tencent.stat.StatService;

public class CalculateApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        StatConfig.setDebugEnable(true);
        StatService.registerActivityLifecycleCallbacks(this);//tencent 上报统计初始化
        Bugly.init(getApplicationContext(), "0a3a47c818", true);//bugly 初始化

    }
}
