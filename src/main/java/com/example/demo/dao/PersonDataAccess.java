package com.example.demo.dao;

import com.example.demo.model.Person;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository("data_access")
public class PersonDataAccess implements PersonDao{

    private static List<Person> DB = new ArrayList<>();
    private static List<Person> personList = getPersonList();

    private static List<Person> getPersonList() {
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            UUID id  = UUID.randomUUID();
            DB.add(new Person(id, faker.name().fullName()));
        }
        return DB;
    }
    @Override
    public int insertPerson(UUID id, Person person){
        DB.add(new Person(id, person.getName()));
        return 1;
    }
    @Override
    public List<Person> getAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonByID(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePerson(UUID id) {
        Optional<Person> isPerson = selectPersonByID(id);
        if(isPerson.isEmpty()){
        return 0;
    }
        else
    {
        DB.remove(isPerson.get());
        return 1;}
    }

    @Override
    public int updatePerson(UUID id, Person person) {
        return selectPersonByID(id).map(p -> {
            int indexOfObjToUpdate = DB.indexOf(p);
            if(indexOfObjToUpdate>=0){
                DB.set(indexOfObjToUpdate,new Person(id, person.getName()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
