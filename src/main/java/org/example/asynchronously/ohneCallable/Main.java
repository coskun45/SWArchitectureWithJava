package org.example.asynchronously.ohneCallable;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int a=5;
        int b=0;
        Rechner r=new Rechner(a,b);

        try{
            System.out.println("Ergebnis ist: "+r.getC());

        }catch (Exception e){
            System.out.println("wohl was schief gegangen: "+e.getMessage());

        }



    }
}
