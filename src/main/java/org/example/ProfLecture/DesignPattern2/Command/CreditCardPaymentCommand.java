package org.example.ProfLecture.DesignPattern2.Command;
// Farklı ödeme komutlarını uygulayan sınıflar
public class CreditCardPaymentCommand implements PaymentCommand{
    private PaymentProcessor processor;

    public CreditCardPaymentCommand(PaymentProcessor processor) {

        this.processor = processor;
    }

    @Override
    public void execute() {

        processor.processCreditCardPayment();
    }
}
