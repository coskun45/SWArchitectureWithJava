package org.example.ProfLecture.InheritanceKapitel2.decorator;

public class GzipDecorator extends PayloadDecorator{
    GzipDecorator(Payload deflated) {
        super(deflated);
    }

    @Override
    public String getText() {
        String balloon = getSource().getText();
        return "inflate(" + balloon + ")";
    }
}
