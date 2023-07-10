package org.example.composite.compositeSon;

import java.math.BigDecimal;

public class App2 {

    public static void main(String[] args) {

        Urun domates = new Urun("Domates", BigDecimal.TEN);
        Urun patates = new Urun("Patates", BigDecimal.ONE);
        Urun sogan = new Urun("Soğan", BigDecimal.ONE);

        Paket sebzePaketi = new Paket("Sebze Paketi");
        sebzePaketi.getUrunList().add(domates);
        sebzePaketi.getUrunList().add(patates);
        sebzePaketi.getUrunList().add(sogan);

        Urun sesSistemi = new Urun("Ses Sistemi", BigDecimal.valueOf(5000));
        Urun kulaklik = new Urun("Kulaklik", BigDecimal.valueOf(1000));

        Paket teknolojiPaketi = new Paket("TeknolojiPaketi");
        teknolojiPaketi.getUrunList().add(sesSistemi);
        teknolojiPaketi.getUrunList().add(kulaklik);

        Urun futbolTopu = new Urun("Futbol Topu", BigDecimal.valueOf(100));



        Kumanya kumanya=new Kumanya("Asker Kumanyasi");
        Urun yag = new Urun("yag", BigDecimal.valueOf(50));
        kumanya.getUrunList().add(yag);
        kumanya.getPaketList().add(sebzePaketi);


        Sepet sepet = new Sepet("Benim Sepetim");
        sepet.getFiyatlanabilirList().add(sebzePaketi);
        sepet.getFiyatlanabilirList().add(teknolojiPaketi);
        sepet.getFiyatlanabilirList().add(futbolTopu);
        sepet.getFiyatlanabilirList().add(kumanya);

        System.out.println(sepet.toplamOdenecekTutar());
    }
}
