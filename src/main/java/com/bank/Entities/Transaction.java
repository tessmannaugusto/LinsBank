package main.java.com.bank.Entities;

import java.util.Date;



public class Transaction {

    public enum TransactionType {
        DEBIT,
        CREDIT;
    }


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
