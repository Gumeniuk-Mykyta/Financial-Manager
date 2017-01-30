package com.vymirs.penionzy.penionzy.Model;

/**
 * Created by Nikita on 1/30/2017.
 */

public class User {
    private String name;
    private Balance balance;
    private static volatile User instance;

    public static User getInstance() {
        User localInstance = instance;
        if (localInstance == null) {
            synchronized (User.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new User();
                }
            }
        }
        return localInstance;
    }

    private User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    private void AddNewSpending(Spending spending) {
        balance.setCurrentAmount(balance.getCurrentAmount() - spending.getAmount());
    }

    private void addEarning(Earning earning) {
        balance.setCurrentAmount(balance.getCurrentAmount() + earning.getAmount());
    }

    private void enterBalance(Float amount) {
        balance = Balance.getInstance();
        balance.setCurrentAmount(amount);
    }
}
