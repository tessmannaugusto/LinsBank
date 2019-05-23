package main.java.com.bank.View;

import main.java.com.bank.Entities.Account;
import main.java.com.bank.Services.AccountServices;

public class WithdrawView extends View {

    private Account account;
    private AccountServices accountServices;

    public WithdrawView(Account account) {
        this.account = account;
        accountServices = new AccountServices(account);
    }

    @Override
    public void print(){
        System.out.print("How much would you like to withdraw? ");
        Double amount = scanner.nextDouble();
        while (amount <= 0 || account.getBalance() < amount){
            System.out.println("You either do not have enough money or you entered a negative or null amount" +
                    ". You have $" + account.getBalance() + " available for withdrawal.");
            System.out.println("Would you like to try withdrawing again (y/n)?");
            char r = scanner.next().charAt(0);
            if (r == 'y') {
                System.out.println("How much do you want to withdraw? ");
                amount = scanner.nextDouble();
                if (amount <=0 || account.getBalance() < amount){

                }else {
                    accountServices.withdraw(amount);
                    System.out.println("Your balance now is: $" + account.getBalance());
                    return;
                }
            }else if (r == 'n'){
                amount = 0.0;
                break;
            }
        }
        accountServices.withdraw(amount);
        System.out.println("Your balance is now: $" + account.getBalance());
    }

    }

