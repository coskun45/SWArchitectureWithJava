package org.example.ProfLecture.Thread.Synchronization;

import java.util.Arrays;

public class JoiningCounter implements Runnable{

    private  String name;
    private double[] data;

    public JoiningCounter(String name,int n) {
        this.name = name;
        this.data=new double[n];
    }

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println(name+ " starting");
            Arrays.sort(data);
            System.out.println(name+ " done");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
