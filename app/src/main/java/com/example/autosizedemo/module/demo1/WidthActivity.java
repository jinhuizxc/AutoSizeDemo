package com.example.autosizedemo.module.demo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.autosizedemo.R;

/**
 * 进行宽度适配
 */
public class WidthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_width);
    }
}
