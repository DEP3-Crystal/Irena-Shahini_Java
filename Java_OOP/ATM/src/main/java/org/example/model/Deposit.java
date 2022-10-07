package org.example.model;

import java.util.Date;

public class Deposit extends Operation {


    public Deposit(double amount, String type, String description) {
        super(amount, "deposit", description);

    }

    @Override
    public String getType() {
        return "Deposit";
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public int getId() {
        return 0;
    }
}
