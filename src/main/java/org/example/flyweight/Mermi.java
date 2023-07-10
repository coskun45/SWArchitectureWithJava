package org.example.flyweight;

public class Mermi {

    private  MermiBoyutu mermiBoyutu;


    public Mermi(MermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
        System.out.println(mermiBoyutu.getBoyut()+ " mm mermi olustu");

        // mermi olusturmaya bir maliyet getirmek icin

        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void atesle() {
        System.out.println("Tak...");
    }
}
