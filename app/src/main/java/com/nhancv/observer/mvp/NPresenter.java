package com.nhancv.observer.mvp;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.nhancv.observer.mvp.observe.Cache;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by nhancao on 10/19/16.
 */

public class NPresenter extends MvpBasePresenter<NView> implements Observer {
    private static final String TAG = NPresenter.class.getName();

    private NModel model;

    public NPresenter() {
        model = new NModel(this);
    }

    public void action() {
        if (getView() != null) {
            getView().updateView(model.getModel());
        }
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof Cache) {
            if (getView() != null) {
                getView().updateView("refresh data: " + o);
            }
        }
    }


}
