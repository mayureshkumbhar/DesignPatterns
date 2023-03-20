package com.example.designpatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton singleton;

    private  ThreadSafeSingleton(){}

    public synchronized static ThreadSafeSingleton getInstance(){
        if(null == singleton)
            singleton = new ThreadSafeSingleton();
        return singleton;
    }
}
