package com.crystal.examples;

public class Employee extends Person{
    public String role;
    public String department;
    public int yearsOfExperiences;
    public int salary;
    Employee(){}
    Employee(int id, String name, String surname, int age, String role, String department, int yearsOfExperiences, int salary) {
    super(id, name, surname, age);
    this.role = role;
    this.department = department;
    this.yearsOfExperiences = yearsOfExperiences;
    this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getYearsOfExperiences() {
        return yearsOfExperiences;
    }

    public void setYearsOfExperiences(int yearsOfExperiences) {
        this.yearsOfExperiences = yearsOfExperiences;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean employed(){
       return true;
    }

    @Override
    public String toString(){
      return "Name: " + this.name + "Surname: " + this.surname + "Years Of Experience: "+ this.yearsOfExperiences + "Salary: " + this.salary;
    }
}
