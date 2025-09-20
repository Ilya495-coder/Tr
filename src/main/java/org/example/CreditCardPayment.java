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

    public void applyDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Скидка должна быть от 0 до 100%");
        }
        double newAmount = getAmount() - (getAmount() * percent / 100);
        setAmount(newAmount);
    }
}
