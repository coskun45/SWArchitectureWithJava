package org.example.ProfLecture.DesignPattern2.Command;

public class PaymentInvoker {
    private PaymentCommand command;

    public void setCommand(PaymentCommand command) {
        this.command = command;
    }

    public void executePayment() {
        command.execute();
    }
}
