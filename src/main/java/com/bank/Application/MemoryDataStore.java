package main.java.com.bank.Application;

import main.java.com.bank.Entities.Account;

public class MemoryDataStore {

    private Account account;
    private InMemoryDatabase inMemoryDatabase;


    public MemoryDataStore(Account account) {
        this.account = account;
        inMemoryDatabase = InMemoryDatabase.getInstance();
    }



    public String put(Object item ){
        String id = account.getNumber().toString() + account.getBranch().toString();
        inMemoryDatabase.getStorage().put(id, item);
        return id;
    }

    public Object get( String id){
        return inMemoryDatabase.getStorage().get(id);
    }
}
