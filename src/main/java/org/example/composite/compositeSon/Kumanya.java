package org.example.composite.compositeSon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements Fiyatlanabilir {
    private String adi;
    private List<Paket> paketList;
    private List<Urun> urunList;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }

    public Kumanya(String adi) {
        this.adi = adi;
        this.paketList=new ArrayList<>();
        this.urunList=new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {
        BigDecimal toplamUrunFiyati = FiyatHesaplamaUtil.getToplamUrunFiyati(urunList);
        BigDecimal toplamPaketFiyati = FiyatHesaplamaUtil.getToplamPaketFiyati(paketList);
        return toplamUrunFiyati.add(toplamPaketFiyati);
    }
}
