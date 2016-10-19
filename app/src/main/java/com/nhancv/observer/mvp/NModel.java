package com.nhancv.observer.mvp;

import android.os.Handler;

import com.nhancv.observer.mvp.observe.Cache;

import java.util.Observer;

/**
 * Created by nhancao on 10/19/16.
 */

public class NModel {
    private static final String TAG = NModel.class.getName();

    private Cache cache;

    private Handler handler;
    private Runnable runnable = () -> getCache().changeMe("from runnable");

    public NModel(Observer observer) {
        cache = new Cache();
        cache.addObserver(observer);
        handler = new Handler();
    }

    public Cache getCache() {
        return cache;
    }

    public String getModel() {
        handler.postDelayed(runnable, 5000);
        return "I'm model";
    }

}
