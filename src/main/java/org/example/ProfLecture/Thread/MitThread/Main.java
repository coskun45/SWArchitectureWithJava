package org.example.ProfLecture.Thread.MitThread;

public class Main {
    public static void main(String[] args) {


        Counter c1=new Counter("memur1",1000);
        Counter c2=new Counter("memur2",10000);


        Thread t1 =new Thread(c1);
        t1.start();
        Thread t2=new Thread(c2);
        t2.start();
        System.out.println("main is done");

    }
}
