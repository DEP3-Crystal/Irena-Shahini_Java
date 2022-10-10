package org.example.services;

import org.example.model.Card;
import org.example.model.Operation;
import org.example.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private int IBAN;
    private Person person;
    private Card card;

    private ArrayList<Operation> transactionList;
    protected double balance;

    public BankAccount(int IBAN, Card card, Person person, ArrayList<Operation> transactionList, double balance) {
        this.IBAN = IBAN;
        this.person = person;
        this.card = card;
        this.transactionList = transactionList;
        this.balance = balance;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");
            PreparedStatement preparedStmt = connection.prepareStatement( "INSERT INTO `atm`.`bank_account` (`IBAN`,`idPerson`, `email`, `firstname`,`lastname`,`cardNo`,`cardType`,`pin`,`balance`) VALUES (?,?,?,?,?,?,?,?,?)" );
            preparedStmt.setInt(1, IBAN);
            preparedStmt.setInt(2, person.getIdPerson());
            preparedStmt.setString(3, person.getEmail());
            preparedStmt.setString(4, person.getFirstname());
            preparedStmt.setString(5, person.getLastname());
            preparedStmt.setInt(6, card.getCardNo());
            preparedStmt.setString(7, card.getCardType());
            preparedStmt.setInt(8, card.getPin());
            preparedStmt.setDouble(9, balance);
            preparedStmt.execute();

        } catch (Exception e) {
            System.out.println("Can not create object because of error:" + e);
        }

    }

        public void showBalance () {
            System.out.println("Your balance is: " + balance);
        }

        public void withdraw ( double amount){
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("New Balance is: " + balance);
            } else {
                System.out.println("Something wrong!");
            }
        }
        public void deposit ( double amount){
            balance = balance + amount;
            System.out.println("New Balance is: " + balance);
        }
    public void ChangePIN(){
        int newPIN, oldPIN;
        System.out.println("Please enter your account's Pin: ");
        Scanner s1 = new Scanner(System.in);
        oldPIN = s1.nextInt();
        if (oldPIN == card.getPin()){
            System.out.println("Enter new PIN: ");
            newPIN = s1.nextInt();
            if(newPIN >= 1000 && newPIN <=9999){
                card.setPin(newPIN);
                System.out.println("New PIN is " + newPIN);
            }
            System.out.println("PIN must have 4 numbers, min 1000!");
        }else
            System.out.println("Wrong PIN");
    }

}
