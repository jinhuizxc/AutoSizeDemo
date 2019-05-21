package com.example.autosizedemo.ext;

import com.example.autosizedemo.app.App;

import me.jessyan.autosize.utils.AutoSizeUtils;
import me.jessyan.autosize.utils.ScreenUtils;

public class ExtScreen {

    //dp转px
    public void dp2px(Float value) {
        AutoSizeUtils.dp2px(App.getContext(), value);
    }

    //sp转px
    public void sp2px(Float value) {
        AutoSizeUtils.sp2px(App.getContext(), value);
    }

    //获取屏幕宽度
    public int screenWidth() {
        int[] screenSize = ScreenUtils.getScreenSize(App.getContext());
        return screenSize[0]; //宽度
    }

    //获取屏幕高度
    public int screenHeight() {
        int[] screenSize = ScreenUtils.getScreenSize(App.getContext());
        return screenSize[1];  //高度
    }

}
