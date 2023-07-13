package org.example.ProfLecture.Thread.SharedResource;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        TeamCounter ahmet=new TeamCounter(c);
        TeamCounter mehmet=new TeamCounter(c);
        TeamCounter ali=new TeamCounter(c);

       Thread t1 =new Thread(ahmet);
       t1.start();
       Thread t2= new Thread(mehmet);
       t2.start();
        Thread t3=new Thread(ali);
        t3.start();
    }
}
