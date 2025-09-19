package org.example;

public class PayPalPayment extends Payment implements Refundable{
    public PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Оплата через PayPal на сумму: " + super.getAmount());
    }

    @Override
    public void refund() {
        System.out.println("Возврат средств с PayPal: " +  super.getAmount());
    }
}
