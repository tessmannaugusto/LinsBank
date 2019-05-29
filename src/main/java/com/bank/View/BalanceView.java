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
        
        /*
        Old way
        account.getTransactions().sort(Comparator.comparing(Transaction::getDate).reversed());
        for (int i = 0; i < account.getTransactions().size(); i++) {
            if( i  < 5) {
               System.out.println(account.getTransactions().get(i));
            }
        }
        */

        account.getTransactions().stream()
                .sorted(Comparator.comparing(Transaction::getDate).reversed())
                .limit(5)
                .forEach(transaction -> {
                    String symbol = transaction.getType() == Transaction.Type.DEBIT ? "-": "+";
                    System.out.printf("%s",symbol);
                    System.out.printf("%.2f \n", transaction.getAmount());
                });
    }
}
