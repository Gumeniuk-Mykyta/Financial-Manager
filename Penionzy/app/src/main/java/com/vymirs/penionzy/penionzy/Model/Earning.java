package com.vymirs.penionzy.penionzy.Model;

/**
 * Created by Nikita on 1/30/2017.
 */

public class Earning {
    private Category category;
    private String date;
    private String time;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private float amount;

}