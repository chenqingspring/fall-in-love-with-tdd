package com.test.sample.factory;

public class AnimalStore {

    Animal cat;
    Animal dog;

    public int countLegs(){
        AnimalFactory catFactory = new CatFactory();
        AnimalFactory dogFactory = new DogFactory();
        dog = dogFactory.animalCreator();
        cat = catFactory.animalCreator();
        return dog.legs()+cat.legs();
    }

}
