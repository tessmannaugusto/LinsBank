package main.java.com.bank.Entities;

import java.text.SimpleDateFormat;

import java.util.Date;



public class Transaction {

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    private Double amount;
    private TransactionType type;
    private Date date = new Date();

    public Transaction(Double amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        if (type == TransactionType.DEBIT){
            return "-" + amount ;

        }else{
            return "+" + amount ;
        }
    }

}
