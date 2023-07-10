package org.example.ProfLecture.InheritanceKapitel2.decorator;

public class EncryptedPaload extends PayloadDecorator{
    public EncryptedPaload(Payload source) {
        super(source);
    }

    @Override
    public String getText() {
        String cipher = getSource().getText();
        return "decrypt(" + cipher + ")";
    }
}
