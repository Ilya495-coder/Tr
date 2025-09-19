package org.example;

public class CryptoPayment extends Payment{
    public CryptoPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Оплата криптовалютой на сумму: " + super.getAmount());
    }
}
