package com.nhancv.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by nhancao on 10/19/16.
 */

public class MyObserver implements Observer {
    private static final String TAG = MyObserver.class.getName();

    @Override
    public void update(Observable o, Object arg) {
        Log.e(TAG, "update: " + arg + " " + ((MyObservable) o).name);
    }
}
