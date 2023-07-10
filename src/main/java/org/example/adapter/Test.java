package org.example.adapter;

public class Test {
    public static void main(String[] args) {
        Priz priz=new Priz();
        Utu utu=new Utu();
        Buzdolabi buzdolabi=new Buzdolabi();


        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabi);
        SamsungTelefon samsungTelefon=new SamsungTelefon();

        TelefonAdapter adapter=new TelefonAdapter(samsungTelefon);// telefonu sar aletine taktim
        priz.elektrikVer(adapter);//sarj aletini prize takiyorm
    }
}
