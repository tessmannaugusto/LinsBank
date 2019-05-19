package main.java.com.bank.Services;

import main.java.com.bank.Entities.Account;

import java.util.Scanner;

public class AccountServices {

    Scanner scanner = new Scanner(System.in);
    private Account account;
    private boolean isLogged = false;


    public AccountServices(Account account) {
        this.account = account;
    }

    public void deposit( Double amount) {

        account.setBalance(account.getBalance() + amount);
    }
    public void withdraw(Double amount){
        account.setBalance(account.getBalance() - amount);
    }

    public void validateAccount(Integer number, Integer branch){

        if (number.equals(account.getNumber()) && branch.equals(account.getBranch())){
            isLogged = true;
            System.out.println("You have successfully logged in.");
        }else {
            System.out.println("Wrong account or branch number. Please try it again.");
        }

    }

    public boolean isLogged() {
        return isLogged;
    }


}




