package com.test.sample.factory;

public class AnimalStore {
    private Dog dog;
    private Cat cat;

    public int countLegs(){
        dog = new Dog();
        cat = new Cat();
        return dog.legs()+cat.legs();
    }

}
