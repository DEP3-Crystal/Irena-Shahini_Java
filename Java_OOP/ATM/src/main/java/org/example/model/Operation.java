package org.example.model;

import java.util.Date;

public  abstract class Operation {

    protected int id;
    protected double amount;
    protected String type;
    protected String description;
    protected Date date;

    Operation(double amount, String type, String description){
        date = new Date();
        this.amount = amount;
        this.description = description;
        this.type = type;
    }


    public  abstract String getType();


    public abstract String getDescription();

    public abstract Date getDate();

    public abstract double getAmount();

    public abstract int getId();

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }
}
