package com.test.sample.factory;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal animalCreator() {
        return new Cat();
    }
}
