package com.example.designpatterns.singleton;

public class BillPughSingleton {

     private BillPughSingleton(){}

    private static class Helper {
        private static final BillPughSingleton singleton = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
         return Helper.singleton;
    }
}
