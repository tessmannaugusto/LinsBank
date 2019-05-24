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

    public void getTransactions( ) {
        transactions.sort(Comparator.comparing(Transaction::getDate).reversed());
        for (int i = 0; i < transactions.size(); i++) {
            if( i  < 5) {
                    System.out.println(transactions.get(i));
            }
        }
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
