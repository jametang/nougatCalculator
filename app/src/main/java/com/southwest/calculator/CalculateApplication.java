package com.southwest.calculator;

import android.app.Application;

import com.tencent.stat.StatConfig;
import com.tencent.stat.StatService;

public class CalculateApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        StatConfig.setDebugEnable(true);
        StatService.registerActivityLifecycleCallbacks(this);

    }
}
