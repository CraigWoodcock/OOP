package com.sparta.cw.oop;

public class Dog extends Animal{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void play(String toy) {
        System.out.println("Dog is playing with toy");

    }
    public void play(int people) {
        System.out.println("Dog is playing with"+people+" people.");

    }

}
