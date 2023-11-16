package com.sparta.cw.oop;

public class Cat extends Animal {


    public Cat(String name, String breed, int age) {
       super(name, breed, age);
    }

    @Override
    public void play() {
        System.out.println("Playing with ball of yarn");;
    }
}

