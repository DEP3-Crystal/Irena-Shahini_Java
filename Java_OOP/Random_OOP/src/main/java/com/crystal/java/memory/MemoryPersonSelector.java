package com.crystal.java.memory;

import com.crystal.java.DataSource;
import com.crystal.java.PersonSelector;

import java.util.Random;

public class MemoryPersonSelector extends PersonSelector {

    private DataSource dataSource = new MemoryDataSource();

    @Override
    protected void listAllPersons() {
        System.out.println("Listing all persons from Memory");
        dataSource.getData().forEach(System.out::println);
    }

    @Override
    protected void selectRandomPerson() {
        Random random = new Random();
        int randomInt = random.nextInt(dataSource.getData().size());
        System.out.println(dataSource.getData().get(randomInt));
    }
}
