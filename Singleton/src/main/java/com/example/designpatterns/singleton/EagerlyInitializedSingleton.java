package com.example.designpatterns.singleton;

public class EagerlyInitializedSingleton {

    // Initialized static instance as soon as declared
    private static EagerlyInitializedSingleton singleton = new EagerlyInitializedSingleton();

    private EagerlyInitializedSingleton(){}

    //This method always returns already initialized instance.
    public static EagerlyInitializedSingleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        EagerlyInitializedSingleton eagerlyInitializedSingleton1 = getInstance();
        EagerlyInitializedSingleton eagerlyInitializedSingleton2 = getInstance();
        System.out.println("EagerlyInitializedSingleton 1: " +eagerlyInitializedSingleton1.hashCode());
        System.out.println("EagerlyInitializedSingleton 2: " +eagerlyInitializedSingleton2.hashCode());
    }

}
