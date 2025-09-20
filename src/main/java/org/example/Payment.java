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
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void validateAmount() {
        if (getAmount() <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше 0");
        }
    }

}