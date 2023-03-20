package com.example.designpatterns.singleton;

import java.io.*;

public class VioletSingletonSerialization implements Serializable {

    private static VioletSingletonSerialization singleton;

    private VioletSingletonSerialization() {}

    public static VioletSingletonSerialization getInstance(){
        if(null == singleton)
            singleton = new VioletSingletonSerialization();
        return singleton;
    }
    // implement readResolve method to return instance created by singleton method
    protected Object readResolve() { return getInstance(); }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        VioletSingletonSerialization singleton1 = getInstance();

        //serialize
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file.txt"));
        outputStream.writeObject(singleton1);
        outputStream.close();

        //de-serialize
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file.txt"));
        VioletSingletonSerialization singleton2 = (VioletSingletonSerialization) inputStream.readObject();
        inputStream.close();

        System.out.println("Singleton 1: " + singleton1.hashCode());
        System.out.println("Singleton 2: " + singleton2.hashCode());

    }

}
