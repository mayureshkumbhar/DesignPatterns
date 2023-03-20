package com.example.designpatterns.singleton;


public class LazyInitializedSingleton {

    private static LazyInitializedSingleton singleton;

    private  LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(null == singleton){
            singleton = new LazyInitializedSingleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        LazyInitializedSingleton singleton1 = getInstance();
        LazyInitializedSingleton singleton2 = getInstance();

        System.out.println("Singleton 1: " + singleton1.hashCode());
        System.out.println("Singleton 2: " + singleton2.hashCode());

    }

}
