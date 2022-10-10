package org.example.memory;

import java.sql.*;
import java.util.Scanner;
public class MyJDBC {
    public static void main(String args[]) {

        System.out.println("Type your IBAN: ");
        Scanner scanner = new Scanner(System.in);
        int IBAN;
        IBAN = scanner.nextInt();
        int chosen;
        double amount;
        do {
            welcome(IBAN);
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
                    showBalance(IBAN);
                    break;
                case 2:
                    System.out.println("Please enter the amount of money that you want to withdraw: ");
                    amount = scanner.nextDouble();
//                    desc = "Withdraw";
//                    Withdraw w = new Withdraw(amount, "Withdraw", desc);
//                    bankAccount.withdraw(w.amount);
                    break;
                case 3:
                    System.out.println("Please enter the amount of money that you want to deposit: ");
                    amount = scanner.nextDouble();
//                    desc = "Withdraw";
//                    d = new Deposit(amount, "Deposit", desc);
//                    bankAccount.deposit(d.amount);
                    break;
                case 4:
//                    bankAccount.ChangePIN();
                    break;
            }
            ;
        } while (chosen != 0);
        System.exit(0);
    }
//    Person person = new Person(2,"email@gmail.com","Irena","Shahin i");
//    Card card = new Card(1234,"debit",1234);
//    BankAccount bank = new BankAccount(85498, person, card,new ArrayList<Operation>(),12569.80);


//        Card card = new Card(123455, "debit", 2567);
//        BankAccount bank = new BankAccount(2569745, card, new Person(3264, "email@gmail.com", "Irena", "Shahin i"), new ArrayList<Operation>(), 12569.80);

//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from bank_account");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("IBAN"));
//
//
////            DELETE FROM table_name WHERE condition;
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        welcome(2569745);



//    methods

    public static void welcome (int IBAN){
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");

                String query ="SELECT firstname,lastname from bank_account where IBAN =?";

                PreparedStatement statement = connection.prepareStatement("SELECT firstname,lastname from bank_account where IBAN =?");
                statement.setInt(1, IBAN);
                ResultSet resultSet = statement.executeQuery();
                if(resultSet.next()) {
                    System.out.println("Hello " + resultSet.getString("firstname") + " " + resultSet.getString("lastname") + " welcome to your Bank Account.");
                }
                } catch (Exception e) {
                System.out.println(e);
            }
//        menu();
        }
    private static void showBalance(int IBAN) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "MySQLPass");
            String query = "SELECT firstname,lastname from bank_account where IBAN =?";

            PreparedStatement statement = connection.prepareStatement("SELECT * from bank_account where IBAN =?");
            statement.setInt(1, IBAN);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                System.out.println(resultSet.getString("firstname") + " " + resultSet.getString("lastname") + " your Balance is: " + resultSet.getDouble(9));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


