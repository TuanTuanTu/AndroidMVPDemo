package com.training.vungoctuan.mvpdemo.activity.main;

import com.training.vungoctuan.mvpdemo.model.DataManager;
import com.training.vungoctuan.mvpdemo.presenter.BasePresenter;

/**
 * Created by vungoctuan on 2/26/18.
 */
public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements
    MainMvpPresenter<V> {
    public MainPresenter(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public String getEmailId() {
        return getmDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getmDataManager().clear();
        getmMvpView().openSplashActivity();
    }
}
