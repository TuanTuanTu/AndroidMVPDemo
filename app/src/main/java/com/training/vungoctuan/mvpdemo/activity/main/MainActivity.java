package com.training.vungoctuan.mvpdemo.activity.main;

import android.content.Context;
import android.content.Intent;

import com.training.vungoctuan.mvpdemo.activity.splash.SplashActivity;
import com.training.vungoctuan.mvpdemo.view.BaseActivity;

/**
 * Created by vungoctuan on 2/26/18.
 */
public class MainActivity extends BaseActivity{
    public static Intent getStartIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }
}
