package main.java.com.bank.View;

import main.java.com.bank.Entities.Account;
import main.java.com.bank.Services.AccountService;


public class LoginView extends View{

    private Account account;
    private AccountService accountService;


    public LoginView(Account account) {
        this.account = account;
        accountService = new AccountService(account);
    }

    public void print(){
        boolean isLogged = false;
        while (!isLogged) {
            System.out.println("Welcome to Lins Bank. Log in to your account to access bank services. ");
            System.out.print("Account number (6 digits): ");
            Integer number = scanner.nextInt();
            while (number.toString().length() != 6) {
                System.out.println("Account number must have 6 digits. Please try again.");
                System.out.print("Account number (6 digits): ");
                number = scanner.nextInt();
            }
            System.out.print("Account branch (4 digits): ");
            Integer branch = scanner.nextInt();
            while (branch.toString().length() != 4) {
                System.out.println("Account branch must have 4 digits. Please try again.");
                System.out.print("Account branch (4 digits): ");
                branch = scanner.nextInt();
            }

            isLogged = accountService.validateAccount(number, branch);
            if (!isLogged){
                System.out.println("Wrong account number or account branch. Please try again.");
            }
        }
        if (isLogged){

            System.out.println("Login successful.");
        }
    }
}
