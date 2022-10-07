package com.crystal.java.db;

import com.crystal.java.PersonSelector;

public class DbPersonSelector extends PersonSelector {

    @Override
    protected void listAllPersons() {
        System.out.println("Listing all persons from the Database");
    }
    @Override
    protected void selectRandomPerson() {

    }

}
