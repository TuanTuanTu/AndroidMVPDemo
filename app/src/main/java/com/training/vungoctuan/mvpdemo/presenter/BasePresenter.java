package com.training.vungoctuan.mvpdemo.presenter;

import com.training.vungoctuan.mvpdemo.model.DataManager;
import com.training.vungoctuan.mvpdemo.view.MvpView;

/**
 * Created by vungoctuan on 2/26/18.
 * It is base class for all presenter that implements MvpPresenter and
 * it is extended by all other presenters there in application.
 */
public class BasePresenter<V extends MvpView> implements MvpPresenter<V>{
    private V mMvpView;
    DataManager mDataManager;

    public BasePresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getmMvpView() {
        return mMvpView;
    }

    public DataManager getmDataManager() {
        return mDataManager;
    }
}
