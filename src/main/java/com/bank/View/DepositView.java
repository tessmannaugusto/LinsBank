package main.java.com.bank.View;

import main.java.com.bank.Entities.Account;
import main.java.com.bank.Services.AccountService;

public class DepositView extends View{

    private Account account;
    private AccountService accountService;

    public DepositView(Account account) {
        this.account = account;
        accountService = new AccountService(account);
    }


    @Override
    public void print(){
        System.out.print("How much would you like to deposit? ");
        Double amount = scanner.nextDouble();
        while (amount <= 0){
            System.out.println("Your deposit must be higher than $0.");
            System.out.println("Would you like to try depositing again (y/n)?");
            char r = scanner.next().charAt(0);
            if (r == 'y') {
                System.out.println("How much do you want to deposit? ");
                amount = scanner.nextDouble();
                if (amount <= 0){

                }else {
                    accountService.deposit(amount);
                    System.out.println("Your balance is now: $" + account.getBalance());
                    return;
                }
            }else if( r == 'n'){
                amount = 0.0;
                break;
            }
        }
        accountService.deposit(amount);
        System.out.println("Your balance is now: $" + account.getBalance());
    }
}
