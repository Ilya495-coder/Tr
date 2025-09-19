package org.example;

public class Main {
    public static void main(String[] args) {
        CryptoPayment cryptoPayment = new CryptoPayment(12.34);
        CreditCardPayment payment = new CreditCardPayment(54.98);
        PayPalPayment payPalPayment = new PayPalPayment(99.999);

        cryptoPayment.processPayment();
        payment.processPayment();
        payPalPayment.processPayment();
        System.out.println("===================================");
        payment.refund();
        payPalPayment.refund();
    }
    }
