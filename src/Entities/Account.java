package Entities;

public class Account {
    private String name;
    private Double balance;



    public Account(){
    }

    public Account(String name, Double balance) {
        this.name = name;
        this.balance = balance;
        System.out.println("Account created.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
