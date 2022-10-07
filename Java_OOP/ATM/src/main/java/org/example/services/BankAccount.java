package org.example.services;

import org.example.model.Card;
import org.example.model.Operation;
import org.example.model.Person;

import java.sql.*;
import java.util.ArrayList;

public class BankAccount {
    private int IBAN;
    private Person person;
    private Card card;

    private ArrayList<Operation> transactionList;
    protected double balance;

    public BankAccount(int IBAN, Person person, Card card, ArrayList<Operation> transactionList, double balance){
        this.IBAN = IBAN;
        this.person = person;
        this.card = card;
        this.transactionList = transactionList;
        this.balance = balance;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");
            PreparedStatement preparedStmt = connection.prepareStatement("INSERT INTO person (idPerson, email, firstname, lastname) VALUES (idPerson, email, firstname, lastname)");
            preparedStmt.executeQuery();
            preparedStmt = connection.prepareStatement("INSERT INTO card (cardNo, CardType, pin) VALUES (cardNo, cardType, pin)");
            preparedStmt.executeQuery();
            preparedStmt = connection.prepareStatement("INSERT INTO bank_account (IBAN, person.idPerson, person.email, person.firstname, person.lastname, card.cardNo, card.cardType, card.pin, balance) VALUES(IBAN, idPerson, email, firstname, lastname, cardNo, cardType, pin, balance)");
            preparedStmt.executeQuery();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("insert into person (idPerson, email, firstname, lastname)"
//                    +"values (person.idPerson, person.email, person.firstname, person.lastname)");
//            statement.executeUpdate("insert into card (cardNo, CardType, pin) "
//                    +"values (card.cardNo, card.cardType, card.pin)");
//            statement.executeUpdate("insert into bank_account (IBAN, idPerson, email, firstname, lastname, cardNo, cardType, pin, balance)"
//                    + "values(IBAN, idPerson, email, firstname, lastname, cardNo, cardType, pin, balance)");


//            statement.executeUpdate("insert into person set idPerson = person.idPerson, email = person.email, firstname = person.firstname, lastname = person.lastname)");
//            statement.executeUpdate("insert into card set cardNo = card.cardNo, CardType = card.cardType, pin = card.Pin) ");
//            statement.executeUpdate("insert into bank_account (IBAN, idPerson = person.idPerson, email = person.email, firstname = person.email, lastname = person.lastname, cardNo = card.cardNo, cardType = card.cardType, pin = card.pin, balance)");

        }catch (Exception e){
            System.out.println("Can not create object because of error:" + e);
        }

    }

    public void showBalance(){
        System.out.println("The Balance is: " + balance);
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("New Balance is: "+ balance);
        }
        else{
            System.out.println("Something wrong!");
        }
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("New Balance is: "+ balance);
    }
//    public void ChangePIN(){
//        int newPIN, oldPIN;
//        System.out.println("Please enter your account's Pin: ");
//        Scanner s1 = new Scanner(System.in);
//        oldPIN = s1.nextInt();
//        if (oldPIN == card.PIN){
//            System.out.println("Enter new PIN: ");
//            newPIN = s1.nextInt();
//            if(newPIN >= 1000 && newPIN <=9999){
//                card.PIN = newPIN;
//                System.out.println("New PIN is " + newPIN);
//            }
//            System.out.println("PIN must have 4 numbers, min 1000!");
//        }else
//            System.out.println("Wrong PIN");
//    }
}
