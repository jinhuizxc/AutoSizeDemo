package com.example.autosizedemo.module.demo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.autosizedemo.R;

import me.jessyan.autosize.internal.CancelAdapt;

/**
 * 取消屏幕适配
 */
public class NoSizeActivity extends AppCompatActivity implements CancelAdapt {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_size);
    }
}
