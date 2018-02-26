package com.training.vungoctuan.mvpdemo.activity.login;

import com.training.vungoctuan.mvpdemo.presenter.MvpPresenter;

/**
 * Created by vungoctuan on 2/26/18.
 */
public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {
    void startLogin(String emailId);
}
