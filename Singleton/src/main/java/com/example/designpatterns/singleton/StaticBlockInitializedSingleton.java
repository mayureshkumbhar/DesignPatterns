package com.example.designpatterns.singleton;

public class StaticBlockInitializedSingleton {

    private static StaticBlockInitializedSingleton singleton;

    // This also Eagerly initialized with help of Static block and exception handling mechanism
    static {
        try {
            singleton = new StaticBlockInitializedSingleton();
        }catch (Exception ex){
            throw new RuntimeException("Some error occurred...");
        }
    }

    private StaticBlockInitializedSingleton(){}

    public static StaticBlockInitializedSingleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        StaticBlockInitializedSingleton singleton1 = getInstance();
        StaticBlockInitializedSingleton singleton2 = getInstance();

        System.out.println("Singleton 1: " + singleton1.hashCode());
        System.out.println("Singleton 2: " + singleton2.hashCode());

    }
}
