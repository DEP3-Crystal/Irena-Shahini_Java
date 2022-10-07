package org.example.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Card {
    private final int cartNo;
    private final String cardType;
    private int PIN;

     public Card(int cartNo, String cardType, int PIN) {
         this.cartNo = cartNo;
         this.cardType = cardType;
         if (PIN >= 1000 && PIN <= 9999) {
             this.PIN = PIN;
         }else System.out.println("Wrong PIN!");
         try {
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");
             PreparedStatement preparedStmt = connection.prepareStatement("INSERT INTO card (cardNo, CardType, pin) VALUES (cardNo, cardType, pin)");
             preparedStmt.execute();
         }catch(Exception e){
             System.out.println(e);
         }
     }

    public String getCardType() {
        return cardType;
    }

    public int getCartNo() {
        return cartNo;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }
}
