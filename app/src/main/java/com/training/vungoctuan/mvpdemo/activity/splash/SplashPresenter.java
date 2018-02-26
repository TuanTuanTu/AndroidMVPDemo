package com.training.vungoctuan.mvpdemo.activity.splash;

import com.training.vungoctuan.mvpdemo.model.DataManager;
import com.training.vungoctuan.mvpdemo.presenter.BasePresenter;

/**
 * Created by vungoctuan on 2/26/18.
 */
public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements
    SplashMvpPresenter<V> {

    public SplashPresenter(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public void decideNextActivity() {
        if(getmDataManager().getLoggedInMode()){
            getmMvpView().openMainActivity();
        }else {
            getmMvpView().openLoginActivity();
        }
    }
}
