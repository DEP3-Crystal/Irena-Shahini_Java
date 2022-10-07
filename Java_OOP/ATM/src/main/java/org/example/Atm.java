//package org.example;
//
//import org.example.services.BankAccount;
//import org.example.model.Deposit;
//import org.example.model.Withdraw;
//
//import java.util.Scanner;
//import java.lang.*;
//public class Atm {
////public static void main(String[] args) {
//    //constructors
//    BankAccount bankAccount;
//

//    eBanking(String name, double balance, int PIN) {
//        if (counter <= 100){
//            this.name = name;
//            this.balance = balance;
//            if (PIN >= 1000 && PIN <= 9999) {
//                this.PIN = PIN;
//            }else System.out.println("Wrong PIN!");
//            numberOfAccounts = numberOfAccounts + 1;
//            accounts[numberOfAccounts - 1] = this;
//            welcome();
//        }
//    }
    //methods
//    public void welcome () {
//        System.out.println("Hello " + bankAccount.P.getFirstName() + " welcome to eBanking. Your account number is: " + bankAccount.P.getFirstName() + this.toString());
//        menu();
//    }
//    private void menu(){
//        int nr;
//
//        Deposit d;
//        double sent, amount;
//        String desc, accountToTransfer;
//        Scanner s1 = new Scanner(System.in);
//

//        do {
//            System.out.println("Please choose one of the following options: ");
//            System.out.println("1. Show your balance. ");
//            System.out.println("2. Withdraw money. ");
//            System.out.println("3. Deposit money. ");
//            System.out.println("4. Change your PIN. ");
////            System.out.println("5. Transfer money to another person.");
//            System.out.println("0. Exit. ");
//            nr = s1.nextInt();
//            switch (nr) {
//                case 1:
//                    bankAccount.showBalance();
//                    break;
//                case 2:
//                    System.out.println("Please enter the amount of money that you want to withdraw: ");
//                    amount = s1.nextDouble();
//                    desc = "Withdraw";
//                    Withdraw w = new Withdraw(amount, "Withdraw", desc);
//                    bankAccount.withdraw(w.amount);
//                    break;
//                case 3:
//                    System.out.println("Please enter the amount of money that you want to deposit: ");
//                    amount = s1.nextDouble();
//                    desc = "Withdraw";
//                    d = new Deposit(amount, "Deposit", desc);
//                    bankAccount.deposit(d.amount);
//                    break;
//                case 4:
//                    bankAccount.ChangePIN();
//                    break;
//                case 5: try {
//                    System.out.println("Please enter the amount of money that you want to sent: ");
//                    sent = s1.nextDouble();
//                    System.out.println("Please enter the account number you want to sent the money to: ");
//                    accountToTransfer = s1.nextLine();
//                    transfer(sent, accountToTransfer);
//                }catch(Exception e) {
//                    System.out.println(e.getStackTrace());
//                }
//                    break;
//            }
//            ;
//        } while (nr != 0);
//        System.exit(0);
//
//
//}
//    public void transfer(double amount, String accountToTransfer) {
//        for (int i = 0; i < 100; i++) {
//            if (accounts[i].toString().equals(accountToTransfer)) {
//                //accounts[i].balance = accounts[i].balance + amount;
//                accounts[i].deposit(deposit.amount);
//                System.out.println("New amount for account number " + accounts[i].toString() + " is: " + accounts[i].balance);
//                System.out.println("The amount of money is completed.");
//                System.out.println("The deduction is completed.");
//                System.out.println("Transaction completed!");
//            }
//        }
//    }

// main
//  }


//}

