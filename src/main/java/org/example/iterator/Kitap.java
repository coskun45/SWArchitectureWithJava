package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kitap {
    private String adi;
    private List<Soru> soruList;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    //public List<Soru> getSoruList()
    public Iterator getSoruIterator() {
        return soruList.iterator();
    }



    public Kitap(String adi) {
        this.adi = adi;
        this.soruList=new ArrayList<>();
        soruList.add( new Soru(1L));
        soruList.add( new Soru(2L));
        soruList.add( new Soru(3L));
        soruList.add( new Soru(4L));
        soruList.add( new Soru(5L));

    }
}
