package main.java.com.bank.Services;

import main.java.com.bank.Entities.Account;


public class AccountServices {


    private Account account;


    public AccountServices(Account account) {
        this.account = account;
    }

    public void deposit( Double amount) {

        account.setBalance(account.getBalance() + amount);
    }
    public void withdraw(Double amount){
        account.setBalance(account.getBalance() - amount);
    }

    public boolean validateAccount(Integer number, Integer branch){
        return number.equals(account.getNumber()) && branch.equals(account.getBranch());
    }




}




