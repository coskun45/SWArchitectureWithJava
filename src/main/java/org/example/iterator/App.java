package org.example.iterator;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {


        Kitap kitap =new Kitap("Matematik");
        //List<Soru> soruList = kitap.getSoruList();
        //yazdirListe(soruList);

        Fasikul fasikul=new Fasikul("Türkce");
        //Soru[] sorular = fasikul.getSorular();
        // burda yazdir methodunu array icin kullanamayiz cünkü yazdir methodu parametre olarak liste aliyor
        //yazdirArray(sorular);



        // iterator ile birlikte yeni islemler

        Iterator soruIteratorKitap = kitap.getSoruIterator();
        Iterator soruIteratorFasikul=fasikul.getSoruIterator();
        yazdir(soruIteratorKitap);
        yazdir(soruIteratorFasikul);


    }

    private static void yazdir(Iterator soruIteratorKitap) {
        while (soruIteratorKitap.hasNext()){
            Soru soru =(Soru) soruIteratorKitap.next();
            Long soruNo= soru.getSoruNo();
            System.out.println("Soru no: "+ soruNo);

        }
    }

    private static void yazdirArray(Soru[] sorular) {
        for (Soru soru : sorular){
            Long soruNo=soru.getSoruNo();

            System.out.println("Soru no: "+ soruNo);
        }
    }

    private static void yazdirListe(List<Soru> soruList) {
        for (Soru soru : soruList){
            Long soruNo=soru.getSoruNo();

            System.out.println("Soru no: "+ soruNo);
        }
    }


}
