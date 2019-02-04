package com.kharysh.ostap;

/**
 * Created by Ostap Kharysh on 22.12.2016.
 */
public class Person {
    /*
    This class creates object instance with certain features.
     */
    String user;
    String password;

    public Person(String Name, String password) {
        this.user = Name;
        this.password = password;
    }

    public String getUserName() {
        return user;
    }
    public String getPassword() {
        return password;
    }

}