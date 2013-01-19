package com.test.sample.factory;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal animalCreator() {
        return new Dog();
    }
}
