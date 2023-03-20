package com.example.designpatterns.singleton;

public class VioletSingletonCloneable implements Cloneable{

    private static VioletSingletonCloneable singleton;

    private VioletSingletonCloneable(){}

    @Override
    public Object clone() throws CloneNotSupportedException{
       return super.clone();
    }

    public static VioletSingletonCloneable getInstance(){
        if(null == singleton)
            singleton = new VioletSingletonCloneable();
        return singleton;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        VioletSingletonCloneable singleton1 = getInstance();
        VioletSingletonCloneable singleton2 = (VioletSingletonCloneable) singleton1.clone();

        System.out.println("Singleton 1: " + singleton1.hashCode());
        System.out.println("Singleton 2: " + singleton2.hashCode());

    }
}
