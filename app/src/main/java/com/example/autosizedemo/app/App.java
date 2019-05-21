package com.example.autosizedemo.app;

import android.app.Application;

import me.jessyan.autosize.AutoSizeConfig;

public class App extends Application {

    private static App context;
    @Override
    public void onCreate() {
        super.onCreate();

//        AutoSizeConfig.getInstance().setBaseOnWidth(false);//默认使用宽度适配
//        AutoSizeConfig.getInstance().setUseDeviceSize(true);//全局全屏适配

        context = this;

    }

    public static App getContext() {
        return context;
    }
}
