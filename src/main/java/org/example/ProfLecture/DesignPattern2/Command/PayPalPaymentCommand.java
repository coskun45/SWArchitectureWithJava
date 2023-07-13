package org.example.ProfLecture.DesignPattern2.Command;

public class PayPalPaymentCommand implements PaymentCommand{
    private PaymentProcessor processor;

    public PayPalPaymentCommand(PaymentProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void execute() {
        processor.processPayPalPayment();
    }
}
