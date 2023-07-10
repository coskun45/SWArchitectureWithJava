package org.example.ProfLecture.InheritanceKapitel2.decorator;

public abstract class PayloadDecorator implements Payload {
    Payload source;

    public PayloadDecorator(Payload source) {
        this.source = source;
    }

    public Payload getSource() {
        return source;
    }
}
