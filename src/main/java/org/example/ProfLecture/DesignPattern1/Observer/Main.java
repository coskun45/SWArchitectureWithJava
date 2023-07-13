package org.example.ProfLecture.DesignPattern1.Observer;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal minSicaklik=BigDecimal.valueOf(23);
        BigDecimal maxSicaklik=BigDecimal.valueOf(28);

        Termometre termometre=new Termometre(minSicaklik,maxSicaklik);

        Ebeveyn anne=new Ebeveyn("anne");
        Ebeveyn baba=new Ebeveyn("baba");

        termometre.addObserver(anne);
        termometre.addObserver(baba);

        for(int i=termometre.getAnlikSicaklik().intValue();i<=30;i++){
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }

        for(int i=termometre.getAnlikSicaklik().intValue();i>=22;i--){
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }
    }
}
