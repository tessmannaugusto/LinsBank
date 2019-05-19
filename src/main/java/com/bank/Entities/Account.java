package main.java.com.bank.Entities;

public class Account {
    private Integer number;
    private Integer branch;

    private Double balance;


    public Account(Integer number, Integer branch, Double balance) {
        this.number = number;
        this.branch = branch;
        this.balance = balance;
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
}
