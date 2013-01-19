package com.test.sample.factory;

public class AnimalFactory {
    public static Dog dogCreator(){
        return new Dog();
    }
    public static Cat catCreator(){
        return new Cat();
    }
}
