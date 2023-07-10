package org.example.adapter;

public class Priz {
    public  void  elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){
        int volt=elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizden "+ volt+ "volt aliniyor");
    }
}
