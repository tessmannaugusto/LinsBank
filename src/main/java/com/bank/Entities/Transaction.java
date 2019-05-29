package main.java.com.bank.Entities;

import java.util.Date;



public class Transaction {

    public enum Type {
        DEBIT,
        CREDIT;
    }


    private Double amount;
    private Type type;
    private Date date = new Date();

    public Transaction(Double amount, Type type) {
        this.amount = amount;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }
}
