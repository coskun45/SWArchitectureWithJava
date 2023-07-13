package org.example.ProfLecture.Thread.Synchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JoiningCounter jc1=new JoiningCounter("jc1",1000);
        JoiningCounter jc2=new JoiningCounter("jc2",1000);

        int counter=0;
        Thread t1=new Thread(jc1);
        t1.start();
        while (t1.isAlive())
            counter++;
            ; // t1 bitinceye kadar sürekli bitti mi bittimi diye soruyor.
        System.out.println(counter + " kez t1 thread ine bitti mi diye sordu ");
        Thread t2=new Thread(jc2);
        t2.start();
        t2.join(); // bu akillica bekliyor t2 inin bitmesini
        System.out.println("main is done");
    }




}
