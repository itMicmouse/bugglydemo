package com.yangyakun.bugglydemo.app;

import android.app.Application;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.yangyakun.bugglydemo.BuildConfig;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.init(getApplicationContext(), BuildConfig.BUGGLYID, false);
        Beta.autoInit = true;
        Beta.autoCheckUpgrade = true;
        Beta.upgradeCheckPeriod = 60 * 1000;
        Beta.initDelay = 1 * 1000;
    }
}
