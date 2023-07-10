package org.example.flyweight;

public abstract class Asker {
    // mermi boyutundan faklilasiyor.
    public   MermiBoyutu mermiBoyutu;

    public Asker(MermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
    }
    public  void  atesEt(){
       // Mermi mermi=new Mermi(mermiBoyutu);// bu sekilde uzun sürüyor
        Mermi mermi =MermiFactory.mermiUret(mermiBoyutu);
        mermi.atesle();
    }
    public  void tara(){
        for(int i=0; i<5;i++){
            atesEt();
        }
    }
}
