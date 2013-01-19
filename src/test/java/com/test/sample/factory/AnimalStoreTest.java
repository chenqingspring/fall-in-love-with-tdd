package com.test.sample.factory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnimalStoreTest {
    @Test
    public void testCountLegs() throws Exception {
        AnimalStore animalStore = new AnimalStore();
        assertThat(animalStore.countLegs(),is(8));

    }
}
