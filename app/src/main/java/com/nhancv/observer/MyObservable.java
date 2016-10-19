package com.nhancv.observer;

import java.util.Observable;

/**
 * Created by nhancao on 10/19/16.
 */

public class MyObservable extends Observable {

    public String name = "Observable";

    public void changeMe(String word) {
        setChanged();
        notifyObservers(word);
    }
}
