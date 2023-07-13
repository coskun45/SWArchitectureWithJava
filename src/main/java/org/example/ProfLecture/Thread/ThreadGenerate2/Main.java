package org.example.ProfLecture.Thread.ThreadGenerate2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("selamun aleyküm from thread1");

            }
        });

        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("selamun aleyküm from thread2");
            }
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("main is done");
    }
}
