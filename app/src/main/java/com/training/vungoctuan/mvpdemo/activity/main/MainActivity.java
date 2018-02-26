package com.training.vungoctuan.mvpdemo.activity.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.training.vungoctuan.mvpdemo.MvpApp;
import com.training.vungoctuan.mvpdemo.R;
import com.training.vungoctuan.mvpdemo.activity.splash.SplashActivity;
import com.training.vungoctuan.mvpdemo.model.DataManager;
import com.training.vungoctuan.mvpdemo.view.BaseActivity;

/**
 * Created by vungoctuan on 2/26/18.
 */
public class MainActivity extends BaseActivity implements MainMvpView{
    TextView mTextViewShow;
    Button mButtonLogout;
    MainPresenter mMainPresenter;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataManager dataManager = ((MvpApp) getApplication()).getmDataManager();
        mMainPresenter = new MainPresenter(dataManager);
        mMainPresenter.onAttach(this);

        mTextViewShow = findViewById(R.id.textViewShow);

        mButtonLogout = findViewById(R.id.buttonLogout);

        mTextViewShow.setText(mMainPresenter.getEmailId());


        mButtonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPresenter.setUserLoggedOut();
            }
        });

    }

    @Override
    public void openSplashActivity() {
        Intent intent = SplashActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
