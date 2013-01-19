package com.test.sample.factory;

public class AnimalStore {

    Animal cat;
    Animal dog;

    public int countLegs(){
        dog = AnimalFactory.dogCreator();
        cat = AnimalFactory.catCreator();
        return dog.legs()+cat.legs();
    }

}
