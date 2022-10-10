package org.example.memory;

import java.sql.*;
import java.util.Scanner;
public class MyJDBC {
    public static void main(String args[]) {
        int IBAN, pin, newPin;
        System.out.println("Type your IBAN: ");
        Scanner scanner = new Scanner(System.in);
        IBAN = scanner.nextInt();
        System.out.println("Type your PIN: ");
        pin = scanner.nextInt();
        double newBalance;
        int chosen;
        double amount;
        try {
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");
//            String query = "SELECT firstname,lastname from bank_account where IBAN =?";
            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * from bank_account where IBAN =? AND pin=?");
            statement.setInt(1, IBAN);
            statement.setInt(2, pin);
            ResultSet resultSet;
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Hello " + resultSet.getString("firstname") + " " + resultSet.getString("lastname") + " welcome to your Bank Account.");
                double balance = resultSet.getDouble(9);
                do {
                    System.out.println("Please choose one of the following options: ");
                    System.out.println("1. Show your balance. ");
                    System.out.println("2. Withdraw money. ");
                    System.out.println("3. Deposit money. ");
                    System.out.println("4. Change your PIN. ");
//            System.out.println("5. Transfer money to another person.");
                    System.out.println("0. Exit. ");
                    chosen = scanner.nextInt();
                    switch (chosen) {
                        case 1:
                            statement = connection.prepareStatement("SELECT * from bank_account where IBAN =?");
                            statement.setInt(1, IBAN);
                            resultSet = statement.executeQuery();
                            if(resultSet.next()) {
                                System.out.println(resultSet.getString("firstname") + " " + resultSet.getString("lastname") + " your Balance is: " + resultSet.getDouble(9));
                            }
                            break;
                        case 2:
                            System.out.println("Please enter the amount of money that you want to withdraw: ");
                            amount = scanner.nextDouble();
                            if(amount <= balance) {
                                statement = connection.prepareStatement("SELECT * from bank_account where IBAN =?");
                                statement.setInt(1, IBAN);
                                resultSet = statement.executeQuery();
                                if(resultSet.next()) {
                                  newBalance = resultSet.getDouble(9) - amount;
                                } else newBalance = resultSet.getDouble(9);
                                statement = connection.prepareStatement("UPDATE bank_account SET balance = ? WHERE IBAN = ?");
                                statement.setDouble(1, resultSet.getDouble(9) - amount);
                                statement.setInt(2, IBAN);
                                statement.execute();
                                System.out.println("Your new balance is: " + newBalance);
                            }else System.out.println("Your balance is lower");
                            break;
                        case 3:
                            System.out.println("Please enter the amount of money that you want to deposit: ");
                            amount = scanner.nextDouble();
                            statement = connection.prepareStatement("SELECT * from bank_account where IBAN =?");
                            statement.setInt(1, IBAN);
                            resultSet = statement.executeQuery();
                            if(resultSet.next()) {
                                newBalance = resultSet.getDouble(9) + amount;
                            } else newBalance = resultSet.getDouble(9);
                            statement = connection.prepareStatement("UPDATE bank_account SET balance = ? WHERE IBAN = ?");
                            statement.setDouble(1, resultSet.getDouble(9) + amount);
                            statement.setInt(2, IBAN);
                            statement.executeUpdate();
                            System.out.println("Your new balance is: " + newBalance);
                            break;
                        case 4:
//                    bankAccount.ChangePIN();
                            break;
                    }
                    ;
                } while (chosen != 0);
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//    Person person = new Person(2,"email@gmail.com","Irena","Shahin i");
//    Card card = new Card(1234,"debit",1234);
//    BankAccount bank = new BankAccount(85498, person, card,new ArrayList<Operation>(),12569.80);

//        Card card = new Card(123455, "debit", 2567);
//        BankAccount bank = new BankAccount(2569745, card, new Person(3264, "email@gmail.com", "Irena", "Shahin i"), new ArrayList<Operation>(), 12569.80);



