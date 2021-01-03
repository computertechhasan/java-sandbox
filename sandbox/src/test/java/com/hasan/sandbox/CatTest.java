package com.hasan.sandbox;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.mockito.Mockito.*;

import java.sql.Connection;

import javax.security.auth.AuthPermission;



public class CatTest {
    
    @Test
    public void shouldMeow() {
        // Given
        Cat myCat = new Cat("catwoman");
        System.out.println("hello world cats!");
        String expectedSound = "meow";

        // When
        String sound = myCat.makeSound();

        // Then
        assertTrue(sound.equals(expectedSound));
    }
    
    @Test
    public void shouldBeScared() {
        // Given
        Cat myCat = new Cat("catwoman");
        Dog myDog = mock(Dog.class);

        when(myDog.makeSound()).thenReturn("bark");

        when(myDog.getBarkSoundFromDogBarkAPI()).thenReturn("BARKBARK");

        System.out.println(myDog.makeSound());

        // When
        // boolean isScared = myCat.isScared(myDog.makeSound());
        boolean isScared = myCat.isScared(myDog.getBarkSoundFromDogBarkAPI());

        
        // Then
        assertTrue(isScared);
    }
}
