package com.crystal.java.memory;

import com.crystal.java.DataSource;
import com.crystal.java.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemoryDataSource implements DataSource {

    public ArrayList<Person> persons = new ArrayList<Person>(Arrays.asList(
            new Person(1, "isuf.muca@crystal-system.eu"),
            new Person(2, "danjel.halili@crystal-system.eu"),
            new Person(3, "flavio.lorenci@crystal-system.eu"),
            new Person(4,"elia.omeri@crystal-system.eu"),
            new Person(5, "ardit.elezi@crystal-system.eu"),
            new Person(6,"luka.buziu@crystal-system.eu"),
            new Person(7, "megi.lala@crystal-system.eu"),
            new Person(8,"irena.shahini@crystal-system.eu"),
            new Person(9,"indrit.vaka@crystal-system.eu"),
            new Person(10,"griselda.5muci@crystal-system.eu"),
            new Person(11,"theodor.gheorghe@crystal-system.eu"),
            new Person(12,"ioan.cocianu@crystal-system.eu"),
            new Person(13,"teofil.mitrea@crystal-system.eu"),
            new Person(14,"eduard.tiutiu@crystal-system.eu"),
            new Person(15,"george.dobrota@crystal-system.eu"),
            new Person(16,"stefanita.plesa@crystal-system.eu"),
            new Person(17,"adrian-nicolae.tigau@crystal-system.eu"),
            new Person(18,"emanuel.grabovschi@crystal-system.eu"),
            new Person(19,"george.sirbu@crystal-system.eu"),
            new Person(20,"andrei.state@crystal-system.eu"),
            new Person(21,"florin-adrian.dumitru@crystal-system.eu"),
            new Person(22,"victor.hincu@crystal-system.eu")));
    @Override
    public List<Person> getData() {
        return persons;
//                new ArrayList<>(Arrays.asList(
//                new Person(1, "isuf.muca@crystal-system.eu"),
//                new Person(2, "danjel.halili@crystal-system.eu"),
//                new Person(3, "flavio.lorenci@crystal-system.eu"),
//                new Person(4,"elia.omeri@crystal-system.eu"),
//                new Person(5, "ardit.elezi@crystal-system.eu"),
//                new Person(6,"luka.buziu@crystal-system.eu"),
//                new Person(7, "megi.lala@crystal-system.eu"),
//                new Person(8,"irena.shahini@crystal-system.eu"),
//                new Person(9,"indrit.vaka@crystal-system.eu"),
//                new Person(10,"griselda.5muci@crystal-system.eu"),
//                new Person(11,"theodor.gheorghe@crystal-system.eu"),
//                new Person(12,"ioan.cocianu@crystal-system.eu"),
//                new Person(13,"teofil.mitrea@crystal-system.eu"),
//                new Person(14,"eduard.tiutiu@crystal-system.eu"),
//                new Person(15,"george.dobrota@crystal-system.eu"),
//                new Person(16,"stefanita.plesa@crystal-system.eu"),
//                new Person(17,"adrian-nicolae.tigau@crystal-system.eu"),
//                new Person(18,"emanuel.grabovschi@crystal-system.eu"),
//                new Person(19,"george.sirbu@crystal-system.eu"),
//                new Person(20,"andrei.state@crystal-system.eu"),
//                new Person(21,"florin-adrian.dumitru@crystal-system.eu"),
//                new Person(22,"victor.hincu@crystal-system.eu")
//        ));
    }
}
