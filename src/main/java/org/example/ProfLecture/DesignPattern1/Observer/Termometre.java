package org.example.ProfLecture.DesignPattern1.Observer;

import java.math.BigDecimal;

public class Termometre extends Observable{
    private BigDecimal anlikSicaklik;
    private BigDecimal minSicaklik;
    private BigDecimal maxSicaklik;

    public Termometre(BigDecimal minSicaklik, BigDecimal maxSicaklik) {

        this.minSicaklik = minSicaklik;
        this.maxSicaklik = maxSicaklik;
        this.anlikSicaklik=BigDecimal.valueOf(24);
    }

    public BigDecimal getAnlikSicaklik() {
        return anlikSicaklik;
    }

    public void setAnlikSicaklik(BigDecimal anlikSicaklik) {
        this.anlikSicaklik = anlikSicaklik;
        System.out.println(anlikSicaklik);
        
        sickaligiKontrolEt();
    }

    private void sickaligiKontrolEt() {
        boolean isCokSicak = anlikSicaklik.compareTo(maxSicaklik) >= 0;
        boolean isCokSoguk = anlikSicaklik.compareTo(minSicaklik) <= 0;

        if(isCokSicak|| isCokSoguk){
            haberVer();
        }
    }
}
