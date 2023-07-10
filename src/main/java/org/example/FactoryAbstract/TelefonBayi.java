package org.example.FactoryAbstract;

public class TelefonBayi {
    public static void main(String[] args) {


        S8Factory s8Factory=new S8Factory();
        s8Factory.getTelefon("s8","2600mah",4,7);

        Note8Factory note8Factory=new Note8Factory();
        note8Factory.getTelefon("not8","3000mah",5,8);
    }
}
