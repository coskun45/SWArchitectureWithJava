package org.example.Factory;

public class TelefonBayi {

    public static void main(String[] args) {
        Telefon s8=TelefonFabrikasi.getTelefon("s8","2500 mah",4,7);
        Telefon note8=TelefonFabrikasi.getTelefon("note8","3000 mah",5,8);

        System.out.println("s8 icin telefon özellikleri");
        System.out.println(s8);

        System.out.println("note8 icin telefon özellikleri");
        System.out.println(note8);
    }




}
