package main.java.com.bank.Services;

import main.java.com.bank.Entities.Account;
import main.java.com.bank.Entities.Transaction;


import static main.java.com.bank.Entities.Transaction.TransactionType.CREDIT;
import static main.java.com.bank.Entities.Transaction.TransactionType.DEBIT;


public class AccountService {


    private Account account;


    public AccountService(Account account) {
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




