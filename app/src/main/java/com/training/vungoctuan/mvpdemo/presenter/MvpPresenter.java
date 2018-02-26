package com.training.vungoctuan.mvpdemo.presenter;

import com.training.vungoctuan.mvpdemo.view.MvpView;

/**
 * Created by vungoctuan on 2/26/18.
 * It is an interface that is implemented by BasePresenter,
 * it acts as base presenter interface that is extended by all other presenter interfaces.
 */
public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);
}
