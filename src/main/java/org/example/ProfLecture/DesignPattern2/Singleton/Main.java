package org.example.ProfLecture.DesignPattern2.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE.nextInt());
        System.out.println(Singleton.INSTANCE.nextInt());
        System.out.println(Singleton.INSTANCE.nextInt());
    }
}
