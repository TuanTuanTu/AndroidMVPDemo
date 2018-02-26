package com.training.vungoctuan.mvpdemo.activity.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.training.vungoctuan.mvpdemo.MvpApp;
import com.training.vungoctuan.mvpdemo.R;
import com.training.vungoctuan.mvpdemo.model.DataManager;
import com.training.vungoctuan.mvpdemo.view.BaseActivity;

/**
 * Created by vungoctuan on 2/26/18.
 */
public class SplashActivity extends BaseActivity implements SplashMvpView {
    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        DataManager dataManager = ((MvpApp) getApplication()).getmDataManager();
        mSplashPresenter = new SplashPresenter(dataManager);
        mSplashPresenter.onAttach(this);
        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
//        Intent intent = MainActivity.getStartIntent(this);
//        startActivity(intent);
//        finish();
    }

    @Override
    public void openLoginActivity() {
//        Intent intent = LoginActivity.getStartIntent(this);
//        startActivity(intent);
//        finish();
    }
}
