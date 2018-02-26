package com.training.vungoctuan.mvpdemo.activity.login;

import com.training.vungoctuan.mvpdemo.model.DataManager;
import com.training.vungoctuan.mvpdemo.presenter.BasePresenter;

/**
 * Created by vungoctuan on 2/26/18.
 */
public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements
    LoginMvpPresenter<V> {

    public LoginPresenter(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getmDataManager().saveEmailId(emailId);
        getmDataManager().setLoggedIn();
        getmMvpView().openMainActivity();
    }
}
