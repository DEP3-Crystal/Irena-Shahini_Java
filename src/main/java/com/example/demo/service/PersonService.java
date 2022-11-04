package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private PersonDao personDao;
    @Autowired
    public PersonService(@Qualifier("data_access") PersonDao personDao){
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.addPerson(person);
    }
    public List<Person> getAllPeople(){
        return personDao.getAllPeople();
    }
    public Optional<Person> getPersonByID(UUID id){
        return personDao.selectPersonByID(id);
    }

    public int deletePerson(UUID id){
        return personDao.deletePerson(id);
    }

    public int updatePerson(UUID id, Person person){
        return personDao.updatePerson(id, person);
    }
}
