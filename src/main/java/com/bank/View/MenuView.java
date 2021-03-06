package main.java.com.bank.View;


import main.java.com.bank.Entities.Account;
import main.java.com.bank.Services.AccountService;


public class MenuView extends View {

    private Account account;
    private AccountService accountServices;

    public MenuView(Account account) {
        this.account = account;
        accountServices = new AccountService(account);
    }

    @Override
    public void print(){
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
                new DepositView(account).print();
            } else if (o == 2) {
                new WithdrawView(account).print();
            }else if( o == 3) {
                new BalanceView(account).print();
            } else if (o != -1) {
                System.out.println("Wrong number, please choose again.");
            }
        }
        System.out.println("Program finished");

    }
}
