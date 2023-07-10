package org.example.adapter;

public class TelefonAdapter implements ElektrikliEvAletleri{
    private  Telefon telefon;

    public TelefonAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
       return telefon.sarjEt();
    }
}
