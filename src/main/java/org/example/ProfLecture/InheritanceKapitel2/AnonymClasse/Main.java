package org.example.ProfLecture.InheritanceKapitel2.AnonymClasse;

public class Main {
    public static void main(String[] args) {
        Katze katze =new Katze();
        katze.macheMiau();// bisher nicht neues

        // 1. klasse erweitern durch anonyme Methode
        Katze katze2=new Katze(){// new den sonraki kisim anonyme klasse
            public  void macheMiau(){
                System.out.println("mirnav...");
            }
            /*


            public  void wasAnders(){
                System.out.println("was anders");
            }*/
        };
        katze2.macheMiau(); // gleiche klasse aber unterschiedliche funktionalität
        //katze2.wasAnders();// original katze class da olmayan bir method ekleyemiyrz


        // 2. interface implementieren
        Lebewesen monkeyy=new Lebewesen() {
            @Override
            public void macheEtwas() {
                System.out.println("uhh ahh");
            }

        };
        monkeyy.macheEtwas();

        method(new Lebewesen() {
            @Override
            public void macheEtwas() {

            }
        });


    }
    public  static void   method(Lebewesen lebewesen){
        lebewesen.macheEtwas();
    }
}
