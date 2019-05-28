package main.java.com.bank.View;


import main.java.com.bank.Entities.Account;
import main.java.com.bank.Entities.Transaction;

import java.util.Comparator;

public class BalanceView extends View {

    private Account account;

    public BalanceView(Account account) {
        this.account = account;
    }

    @Override
    public void print(){
        System.out.println("Your account balance is: " + account.getBalance());
        System.out.println("Last transactions: ");
        account.getTransactions().sort(Comparator.comparing(Transaction::getDate).reversed());
        for (int i = 0; i < account.getTransactions().size(); i++) {
            if( i  < 5) {
               System.out.println(account.getTransactions().get(i));
            }
        }
    }
}
