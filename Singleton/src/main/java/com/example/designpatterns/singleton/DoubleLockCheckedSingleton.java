package com.example.designpatterns.singleton;

public class DoubleLockCheckedSingleton {

    private static DoubleLockCheckedSingleton singleton;

    private DoubleLockCheckedSingleton() {
    }

    public static DoubleLockCheckedSingleton getInstance() {
        if(null == singleton){
            //Acquire Class level lock so that gets locks on all static members.
            synchronized (DoubleLockCheckedSingleton.class){
                if(null == singleton)
                    singleton = new DoubleLockCheckedSingleton();
            }
        }
        return singleton;
    }
}
