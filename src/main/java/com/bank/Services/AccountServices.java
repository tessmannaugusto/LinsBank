package main.java.com.bank.Services;

import main.java.com.bank.Entities.Account;
import main.java.com.bank.Entities.Transaction;



import static main.java.com.bank.Entities.TransactionType.CREDIT;
import static main.java.com.bank.Entities.TransactionType.DEBIT;


public class AccountServices {


    private Account account;


    public AccountServices(Account account) {
        this.account = account;
    }

    public void deposit( Double amount) {

        account.setBalance(account.getBalance() + amount);
        account.addTransaction(new Transaction(amount, CREDIT));
    }
    public void withdraw(Double amount){
        account.setBalance(account.getBalance() - amount);
        account.addTransaction(new Transaction(amount, DEBIT));
    }

    public boolean validateAccount(Integer number, Integer branch){
        return number.equals(account.getNumber()) && branch.equals(account.getBranch());
    }





}




