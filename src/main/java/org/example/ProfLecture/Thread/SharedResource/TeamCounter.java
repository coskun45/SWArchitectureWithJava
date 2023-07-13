package org.example.ProfLecture.Thread.SharedResource;

public class TeamCounter implements Runnable {

    Counter c;

    public TeamCounter(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i=0; i<10000;i++){
            c.increment();
        }
        System.out.println("Total beans: "+c.getCount());
    }
}
