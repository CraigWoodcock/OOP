package com.sparta.cw.oop;

public class Goldfish extends Animal implements Flyable{
    public Goldfish(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void fly() {
        System.out.println("im flying");
    }

    @Override
    public void stop() {

    }
}
