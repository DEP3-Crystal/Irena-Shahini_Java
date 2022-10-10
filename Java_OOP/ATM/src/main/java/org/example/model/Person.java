package org.example.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Objects;

public class Person {

    private int idPerson;
    private String firstname;
    private String lastname;
    private String email;

    public Person(int idPerson, String email, String firstname, String lastname) {
        this.idPerson = idPerson;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");
            PreparedStatement preparedStmt = connection.prepareStatement(
                    "INSERT INTO `atm`.`person` (`idPerson`, `email`, `firstname`,`lastname`) VALUES (?,?,?,?)" );
            preparedStmt.setInt    (1, idPerson);
            preparedStmt.setString (2, email);
            preparedStmt.setString (3, firstname);
            preparedStmt.setString (4, lastname);
            preparedStmt.execute();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + idPerson +
                ", FIRST NAME: '" + firstname + '\'' +
                ", LAST NAME: '" + lastname + '\'' +
                ", EMAIL: '" + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return idPerson == person.idPerson && Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerson, firstname, lastname, email);
    }
}
