package com.hasan.sandbox;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        Dog anotherDog = new Dog("ralph");
        System.out.println(anotherDog.makeSound());
    }
}
