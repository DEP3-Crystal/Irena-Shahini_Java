package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
@RequestMapping("/persons")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping
    public List<Person> addPerson(@RequestBody Person person){
        personService.addPerson(person);
        return personService.getAllPeople();
    }
    @GetMapping
    public List<Person> getAllPerson(){
        return personService.getAllPeople();
    }

    @GetMapping(path="{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.getPersonByID(id).orElse(null);
    }

    @DeleteMapping(path="{id}")
    public int deletePersonById(@PathVariable("id")UUID id){
        return personService.deletePerson(id);
    }

    @PutMapping(path="{id}")
    public int updatePerson(@PathVariable("id") UUID id, @RequestBody Person person){
    return personService.updatePerson(id,person);
    }

}
