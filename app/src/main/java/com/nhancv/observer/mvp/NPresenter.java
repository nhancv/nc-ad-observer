package com.nhancv.observer.mvp;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

/**
 * Created by nhancao on 10/19/16.
 */

public class NPresenter extends MvpBasePresenter<NView> {

    private NModel model;

    public NPresenter() {
        model = new NModel();
    }

    public void action() {
        if (getView() != null) {
            getView().updateView(model.getModel());
        }
    }


}
