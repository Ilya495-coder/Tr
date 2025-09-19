package org.example;

public class CreditCardPayment extends Payment implements Refundable{
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Оплата картой на сумму: " + super.getAmount());
    }
    @Override
    public void refund() {
        System.out.println("Возврат средств c карты: " +  super.getAmount());
    }
}
