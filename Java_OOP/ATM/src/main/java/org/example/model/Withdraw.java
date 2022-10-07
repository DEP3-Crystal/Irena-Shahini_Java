package org.example.model;

import java.util.Date;

public class Withdraw extends Operation {
    Withdraw(double amount, String type, String description) {
        super(amount, "Withdraw", description);
    }

    @Override
    public String getType() {
        return "Withdraw";
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
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }
}
