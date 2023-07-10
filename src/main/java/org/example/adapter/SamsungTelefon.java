package org.example.adapter;

public class SamsungTelefon implements Telefon{
    private  int calismaVoltaji;

    public SamsungTelefon() {
        this.calismaVoltaji = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("samsung telefon calisiyor");
        return  calismaVoltaji;
    }
}
