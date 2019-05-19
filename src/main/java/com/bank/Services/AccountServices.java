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
        while (amount <= 0){
            System.out.println("Your deposit must be higher than $0.");
            System.out.println("Would you like to try depositing again (y/n)?");
            char r = scanner.next().charAt(0);
            if (r == 'y') {
                System.out.println("How much do you want to deposit? ");
                amount = scanner.nextDouble();
                account.setBalance(account.getBalance() + amount);
                System.out.println("Your balance is now: $" + account.getBalance());
                return;
            }else if( r == 'n'){
                amount = 0.0;
                break;
            }
        }
        account.setBalance(account.getBalance() + amount);
        System.out.println("Your balance is now: $" + account.getBalance());
    }
    public void withdraw(Double amount){
        while (amount <= 0 || account.getBalance() < amount){
            System.out.println("You either do not have enough money or you entered a negative or null amount" +
                    ". You have $" + account.getBalance() + " available for withdrawal.");
            System.out.println("Would you like to try depositing again (y/n)?");
            char r = scanner.next().charAt(0);
            if (r == 'y') {
                System.out.println("How much do you want to withdraw? ");
                amount = scanner.nextDouble();
                account.setBalance(account.getBalance() - amount);
                System.out.println("Your balance now is: $" + account.getBalance() );
                return;
            }else if (r == 'n'){
                amount = 0.0;
                break;
            }
        }
        account.setBalance(account.getBalance() - amount);
        System.out.println("Your balance is now: $" + account.getBalance());
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




