package org.example.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Card {
    private final int cardNo;
    private final String cardType;
    private int pin;

     public Card(int cardNo, String cardType, int pin) {
         this.cardNo = cardNo;
         this.cardType = cardType;
         if (pin >= 1000 && pin <= 9999) {
             this.pin = pin;
         }else System.out.println("Wrong PIN!");
         try {
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");
             PreparedStatement preparedStmt = connection.prepareStatement(
             "INSERT INTO `atm`.`card` (`cardNo`, `cardType`, `pin`) VALUES (?,?,?)" );
             preparedStmt.setInt    (1, cardNo);
             preparedStmt.setString (2, cardType);
             preparedStmt.setInt    (3, pin);
             preparedStmt.execute();
         }catch(Exception e){
             System.out.println(e);
         }
     }

    public String getCardType() {
        return cardType;
    }

    public int getCardNo() {
        return cardNo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
