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

            int o = 0;
            while(o != -1) {
                System.out.println("Menu: ");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("Option (enter -1 to exit): ");
                o = scanner.nextInt();
                if (o == 1){
                    System.out.print("How much would you like to deposit? ");
                    Double amount = scanner.nextDouble();
                    as.deposit(amount);
                }else if (o == 2){
                    System.out.print("How much would you like to withdraw? ");
                    Double withdraw = scanner.nextDouble();
                    as.withdraw(withdraw);
                }else if (o != -1){
                    System.out.println("Wrong number, please choose again.");

                }
            }
            System.out.println("Program finished");

        }catch (InputMismatchException e){
            System.out.println("Error: Deposit and withdraw inputs must contain only numbers.");


        }

        scanner.close();
    }
}
