package com.crystal.examples.oop;

public class Test {
    public static void main(String[] args){
        Person p1 = new Employee();
        Employee e1 = new Manager();

       System.out.print(p1.employed());
    }
}
