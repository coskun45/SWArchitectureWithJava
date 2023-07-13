package org.example.ProfLecture.DesignPattern2.Command;

// Alıcı (Receiver) sınıfı
public class PaymentProcessor {
    public void processCreditCardPayment() {

        System.out.println("Kredi kartı ödeme işlemi gerçekleştiriliyor.");
    }

    public void processPayPalPayment() {

        System.out.println("PayPal ödeme işlemi gerçekleştiriliyor.");
    }
}
