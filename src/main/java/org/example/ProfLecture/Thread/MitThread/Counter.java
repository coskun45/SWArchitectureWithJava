package org.example.ProfLecture.Thread.MitThread;

import java.util.Arrays;

public class Counter implements Runnable {

    private final String name;
    private  final double[] data;

    public Counter(String name, int n) {
        this.name = name;
        data=new double[n];
    }

    public void run(){
        System.out.println(name + " is starting...");
        Arrays.sort(data);
        System.out.println(name + " is done...");

    }
}
