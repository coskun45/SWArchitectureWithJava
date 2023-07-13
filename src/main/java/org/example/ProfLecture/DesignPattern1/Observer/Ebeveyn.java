package org.example.ProfLecture.DesignPattern1.Observer;

public class Ebeveyn implements Observer{
    private  String ad;

    public Ebeveyn(String ad) {
        this.ad = ad;
    }

    @Override
    public void update(Observable observable) {
        Termometre termometre =(Termometre) observable;
        System.out.println(ad+ " dedi ki: ooo sicaklik "+ termometre.getAnlikSicaklik()+ " derece olmus...");

    }
}
