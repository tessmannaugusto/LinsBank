package main.java.com.bank.View;


import main.java.com.bank.Entities.Account;

public class BalanceView {

    private Account account;

    public BalanceView(Account account) {
        this.account = account;
    }

    public void print(){
        System.out.println("Your account balance is: " + account.getBalance() );
    }
}
