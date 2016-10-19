package com.nhancv.observer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.nhancv.observer.mvp.NPresenter;
import com.nhancv.observer.mvp.NView;

public class MainActivity extends MvpActivity<NView, NPresenter> implements NView {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPresenter().action();

    }

    @NonNull
    @Override
    public NPresenter createPresenter() {
        return new NPresenter();
    }

    @Override
    public void updateView(String msg) {
        Log.e(TAG, "updateView: " + msg);
    }
}
