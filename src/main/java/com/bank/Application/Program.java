package main.java.com.bank.Application;

import main.java.com.bank.Entities.Account;
import main.java.com.bank.Services.AccountServices;
import main.java.com.bank.View.BalanceView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account acc = new Account(123456, 1111, 0.0);
        AccountServices as = new AccountServices(acc);
        try {
            while (!as.isLogged()) {
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
                as.validateAccount(number, branch);
            }

                int o = 0;
                while (o != -1) {
                    System.out.println();
                    System.out.println("------------------------------");
                    System.out.println();
                    System.out.println("Menu: ");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Balance");
                    System.out.print("Option (enter -1 to exit): ");
                    o = scanner.nextInt();
                    if (o == 1) {
                        System.out.print("How much would you like to deposit? ");
                        Double amount = scanner.nextDouble();
                        as.deposit(amount);
                    } else if (o == 2) {
                        System.out.print("How much would you like to withdraw? ");
                        Double withdraw = scanner.nextDouble();
                        as.withdraw(withdraw);
                    }else if( o == 3) {
                        new BalanceView(acc).print();
                    } else if (o != -1) {
                        System.out.println("Wrong number, please choose again.");
                    }
                }
                System.out.println("Program finished");

        }catch (InputMismatchException e){
            System.out.println("Error: Account number, Account Branch, Deposit and withdraw inputs must contain only numbers." +
                     "Please try again.");
        }

        scanner.close();
    }
}
