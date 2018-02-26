package com.training.vungoctuan.mvpdemo;

import android.app.Application;

import com.training.vungoctuan.mvpdemo.model.DataManager;
import com.training.vungoctuan.mvpdemo.model.SharedPrefsHelper;

/**
 * Created by vungoctuan on 2/26/18.
 */
public class MvpApp extends Application{
    DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        mDataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getmDataManager() {
        return mDataManager;
    }
}
