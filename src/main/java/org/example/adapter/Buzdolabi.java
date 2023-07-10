package org.example.adapter;

public class Buzdolabi implements ElektrikliEvAletleri {
    private  int volt;

    public Buzdolabi() {
        this.volt=220;

    }

    @Override
    public int prizeTakVeCalistir() {
        System.out.println("buzdolabi calisiyor");
        return  volt;


    }
}
