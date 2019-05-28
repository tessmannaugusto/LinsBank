package main.java.com.bank.Entities;


import java.util.*;


public class Account {
    private Integer number;
    private Integer branch;

    private Double balance;

    private List<Transaction> transactions = new ArrayList<>();

    public Account(Integer number, Integer branch, Double balance) {
        this.number = number;
        this.branch = branch;
        this.balance = balance;

    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Integer getNumber() {
        return number;
    }


    public Integer getBranch() {
        return branch;
    }


    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

}
