package com.training.vungoctuan.mvpdemo.activity.splash;

import com.training.vungoctuan.mvpdemo.presenter.MvpPresenter;

/**
 * Created by vungoctuan on 2/26/18.
 */
public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {
    void decideNextActivity();
}
