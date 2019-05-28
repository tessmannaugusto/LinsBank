package main.java.com.bank.Application;

import main.java.com.bank.Entities.Account;
import main.java.com.bank.View.LoginView;
import main.java.com.bank.View.MenuView;

import java.util.InputMismatchException;

public class Program {

    public static void main(String[] args) {


        Account acc = new Account(123456, 1111, 0.0);
        LoginView loginView = new LoginView(acc);
        MenuView menuView = new MenuView(acc);
        MemoryDataStore memoryDataStore = new MemoryDataStore(acc);
        //printando p testes
        System.out.println(memoryDataStore.put(acc));
        System.out.println(memoryDataStore.get("1234561111"));
        //funcionando

        try {
            loginView.print();
            menuView.print();


        }catch (InputMismatchException e){
            System.out.println("Error: Account number, Account Branch, Deposit and withdraw inputs must contain only numbers." +
                     "Please try again.");
        }

    }
}
