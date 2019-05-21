package com.example.autosizedemo.module.demo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.autosizedemo.R;

import me.jessyan.autosize.internal.CustomAdapt;

/**
 * 进行高度适配
 */
public class HeightActivity extends AppCompatActivity implements CustomAdapt {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);
    }

    //取消以宽度为基准进行适配
    @Override
    public boolean isBaseOnWidth() {
        return false;
    }

    //返回高度的单位尺寸
    @Override
    public float getSizeInDp() {
        return 640f;
    }
}
