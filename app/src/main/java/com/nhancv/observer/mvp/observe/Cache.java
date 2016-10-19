package com.nhancv.observer.mvp.observe;

import java.util.Observable;

/**
 * Created by nhancao on 10/19/16.
 */

public class Cache extends Observable {

    public void changeMe(String word) {
        setChanged();
        notifyObservers(word);
    }

}
