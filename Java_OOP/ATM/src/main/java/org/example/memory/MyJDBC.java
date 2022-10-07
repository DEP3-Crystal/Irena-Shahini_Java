package org.example.memory;

import org.example.model.Card;
import org.example.model.Operation;
import org.example.model.Person;
import org.example.services.BankAccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MyJDBC {
public static void main(String args[]) {
    Person person = new Person(2,"email@gmail.com","Irena","Shahini");
    Card card = new Card(1234,"debit",1234);
    BankAccount bank = new BankAccount(85498, person, card,new ArrayList<Operation>(),12569.80);

    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from bank_account");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("IBAN"));


//            DELETE FROM table_name WHERE condition;
        }
    }catch(Exception e){
        System.out.println(e);
        }

}

}
