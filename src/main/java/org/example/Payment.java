package org.example;

public  abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();

    public double getAmount(){
        return amount;
    }


}