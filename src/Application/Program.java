package Application;

import Entities.Account;
import Services.AccountServices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Create new account. ");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Initial deposit: ");
            Double deposit = scanner.nextDouble();

            AccountServices as = new AccountServices(new Account(name, deposit));

            System.out.print("Would you like to make a deposit(y/n)? ");
            char a = scanner.next().toLowerCase().charAt(0);
            if (a == 'y'){
                System.out.print("How much would you like to deposit? ");
                Double amount = scanner.nextDouble();
                as.deposit(amount);
            }

            System.out.print("Would you like to make a withdrawal(y/n)? ");
            char b = scanner.next().toLowerCase().charAt(0);
            if (b == 'y') {

                System.out.print("How much would you like to withdraw? ");
                Double withdral = scanner.nextDouble();
                as.withdral(withdral);
            }


        }catch (InputMismatchException e){
            System.out.println("Error: Deposit and withdral inputs must contain only numbers.");


        }

        scanner.close();
    }
}
