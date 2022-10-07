package com.crystal.examples.oop;

public class Manager extends Employee {

    private Employee[] reports;
    Manager(){}
    Manager(int id, String name, String surname, int age, String title, String department, int yearsOfExperiences, int salary){
      super(id, name, surname, age, title, department, yearsOfExperiences, salary);
    }

    public void setReports(Employee[] reports){
        this.reports = reports;
    }

    public void setReports(Employee e, int days){
        System.out.println(e.name+ " " + e.surname + "has " + days );
    }

}
