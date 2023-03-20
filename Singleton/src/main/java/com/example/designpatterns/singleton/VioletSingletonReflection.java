package com.example.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VioletSingletonReflection {

    private static VioletSingletonReflection singleton;

    private VioletSingletonReflection() {
        if(null != singleton)
            throw new RuntimeException("Singleton already initialized");
    }

    public static VioletSingletonReflection getInstance(){
        if(null == singleton)
            singleton = new VioletSingletonReflection();
        return singleton;
    }
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        //violetSingleton();
        EnumSingleton singleton1 = EnumSingleton.SINGLETON;
        System.out.println("Singleton 1: " + singleton1.hashCode());
        EnumSingleton singleton2 = null;
        Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            singleton2 = (EnumSingleton) constructor.newInstance();
        }
        System.out.println("Singleton 2: " + singleton2.hashCode());
    }

    private static void violetSingleton() throws InstantiationException, IllegalAccessException, InvocationTargetException {
        VioletSingletonReflection singleton2 = null;
        Constructor[] constructors = VioletSingletonReflection.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            singleton2 = (VioletSingletonReflection) constructor.newInstance();
        }
        System.out.println("Singleton 2: " + singleton2.hashCode());
        VioletSingletonReflection singleton1 = VioletSingletonReflection.getInstance();
        System.out.println("Singleton 1: " + singleton1.hashCode());
    }

}
