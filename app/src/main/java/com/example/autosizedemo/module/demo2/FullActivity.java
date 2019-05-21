package com.example.autosizedemo.module.demo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.autosizedemo.R;

import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.internal.CustomAdapt;

public class FullActivity extends AppCompatActivity implements CustomAdapt {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AutoSizeConfig.getInstance().setUseDeviceSize(true); //使用设备的完整尺寸
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);
    }

    @Override
    public boolean isBaseOnWidth() {
        return false;
    }

    @Override
    public float getSizeInDp() {
        return 640f;
    }

}
