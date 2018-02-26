package com.training.vungoctuan.mvpdemo.activity.main;

import com.training.vungoctuan.mvpdemo.presenter.MvpPresenter;

/**
 * Created by vungoctuan on 2/26/18.
 */
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {
    String getEmailId();
    void setUserLoggedOut();
}
