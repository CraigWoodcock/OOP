package com.sparta.cw.oop;

public class App {
    public static void main(String[] args) {



        Cat wiskers = new Cat("bluebell","tabby", 12);


//        wiskers.setName("bonkers");
//        wiskers.setAge(8);
//        wiskers.setBreed("Ugly Cat");
        System.out.println(wiskers);

        wiskers.play();

        Dog scooby = new Dog("Scooby doo", "Great Dane", 10);
        scooby.play("ball");
        scooby.play(5);
        scooby.play();

        Animal[] animals= new Animal[3];

        animals[0] = wiskers;
        animals[1] = scooby;
        animals[2] = new Goldfish("bob","tropical", 2);

        for (Animal animal:animals) {
            animal.play();
        }
    }
}
