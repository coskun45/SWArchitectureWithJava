package org.example.ProfLecture.InheritanceKapitel2.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        String s="Bismillah";
        int i=0;

        Yazdir y=(a)->{return a;};
        System.out.println(y.stringYazdir(s));
    }
}
