package Services;

import Entities.Account;

import java.util.Scanner;

public class AccountServices {

    Scanner scanner = new Scanner(System.in);
    private Account account;


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
            }else if( r == 'n'){
                break;
            }
        }
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
            }else if (r == 'n'){
                break;
            }
        }
    }


}
