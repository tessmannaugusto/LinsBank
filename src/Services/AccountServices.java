package Services;

import Entities.Account;

import java.util.Scanner;

public class AccountServices {

    Scanner scanner = new Scanner(System.in);
    private Account account;


    public Account getAccount() {
        return account;
    }

    public AccountServices(Account account) {
        this.account = account;
    }

    public void deposit( Double amount) {
        while (amount <= 0){
            System.out.println("Your deposit must be higher than $0.");
            amount = scanner.nextDouble();
        }
        account.setBalance(account.getBalance() + amount);
        System.out.println("Your balance is now: $" + account.getBalance());
    }
    public void withdraw(Double amount){
        while (account.getBalance() < amount){
            System.out.println("You do not have enough money. You have $" + account.getBalance() + " available for withdrawal.");
            System.out.print("How much do you want to withdraw? ");
            amount = scanner.nextDouble();

        }
            account.setBalance(account.getBalance() - amount);
            System.out.println("Your balance now is: $" + account.getBalance() );

    }


}
