package com.nhancv.observer.mvp;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by nhancao on 10/19/16.
 */

public interface NView extends MvpView {
    void updateView(String msg);
}
