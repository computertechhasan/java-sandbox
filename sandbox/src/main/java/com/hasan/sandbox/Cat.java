package com.hasan.sandbox;

public class Cat {

    private String name;
    
    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String makeSound() {
        return "meow";
    }

    public boolean isScared(String soundHeard) {
        if (soundHeard == "bark") {
            return true;
        }
        return false;
    }
}
