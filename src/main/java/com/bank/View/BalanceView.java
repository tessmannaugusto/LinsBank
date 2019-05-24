package main.java.com.bank.View;


import main.java.com.bank.Entities.Account;

public class BalanceView extends View {

    private Account account;

    public BalanceView(Account account) {
        this.account = account;
    }

    @Override
    public void print(){
        System.out.println("Your account balance is: " + account.getBalance());
        System.out.println("Last transactions: ");
        account.getTransactions();
    }
}
