package com.vymirs.penionzy.penionzy.Model;

/**
 * Created by Nikita on 1/30/2017.
 */

public class Balance {
    private float currentAmount;
    private static volatile Balance instance;

    public static Balance getInstance() {
        Balance localInstance = instance;
        if (localInstance == null) {
            synchronized (Balance.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Balance();
                }
            }
        }
        return localInstance;
    }


    private Balance() {

    }

    public float getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(float currentAmount) {
        this.currentAmount = currentAmount;
    }


    private void withdraw(float amount) {


    }

    private void addFunds(float amount) {
    }
}
