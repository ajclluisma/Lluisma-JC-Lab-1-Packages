package org.example;

import packageone.ClassOne;
import packagetwo.ClassTwo;
import packagethree.ClassThree;

// Import here manually
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();

        System.out.println(classOne.greet());
        System.out.println(classTwo.greet());
        System.out.println(classThree.greet());
    }
}