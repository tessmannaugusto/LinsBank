package main.java.com.bank.Application;

import java.util.HashMap;

public class InMemoryDatabase {

    private static InMemoryDatabase instance;

    private HashMap<String, Object> storage;

    private InMemoryDatabase(){
        storage = new HashMap<>();
    }

    public static InMemoryDatabase getInstance(){
        if (instance == null){
            instance = new InMemoryDatabase();
        }
        return instance;
    }

    public HashMap<String, Object> getStorage() {
        return storage;
    }

    //apenas para testes
    @Override
    public String toString() {
        return "InMemoryDatabase{" +
                "storage=" + storage +
                '}';
    }
}
