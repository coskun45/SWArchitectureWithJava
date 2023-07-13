package org.example.ProfLecture.DesignPattern2.Command;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentCommand creditCardCommand = new CreditCardPaymentCommand(processor);
        PaymentCommand paypalCommand = new PayPalPaymentCommand(processor);

        PaymentInvoker invoker = new PaymentInvoker();

        // İstediğimiz ödeme komutunu Invoker üzerinden çağırabiliriz
        invoker.setCommand(creditCardCommand);
        invoker.executePayment(); // Output: Kredi kartı ödeme işlemi gerçekleştiriliyor.

        invoker.setCommand(paypalCommand);
        invoker.executePayment(); // Output: PayPal ödeme işlemi gerçekleştiriliyor.
    }
}
