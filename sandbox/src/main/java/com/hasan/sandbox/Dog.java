package com.hasan.sandbox;

import java.sql.Connection;

import javax.security.auth.AuthPermission;

public class Dog {
    private String name;
    
    public Dog(String name, Connection APIConnection, AuthPermission authPermission) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String makeSound() {
        return "woof";
    }

    public String getBarkSoundFromDogBarkAPI() {
        String returnString = "";
        // do complicated stuff and assign result to return string
        return returnString;
    }
}
