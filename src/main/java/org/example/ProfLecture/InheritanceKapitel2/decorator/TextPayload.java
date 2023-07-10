package org.example.ProfLecture.InheritanceKapitel2.decorator;

public class TextPayload implements Payload {
    private String text;
    TextPayload(String text) {
        this.text = text;
    }
    @Override
    public String getText() {
        return text;
    }
}
