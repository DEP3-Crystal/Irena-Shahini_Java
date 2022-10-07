package com.crystal.examples;

public abstract class  Person {
    public int id;
    public String name;
    public String surname;
    public int age;
    Person(){}
    Person(int id, String name, String surname, int age){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean employed()
    {
        return false;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + "Surname: " + this.surname + "Age: "+ this.age;
    }


}