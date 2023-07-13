package org.example.ProfLecture.Thread.OhneThread;

import java.util.Arrays;

public class BeanCounter {
    private final String name;
    private final double[] data;
    BeanCounter(String name, int n) {
        this.name = name;
        this.data = new double [n];
    }

    public void run() {
        System.out.println(name + " is starting...");
        Arrays.sort(data);
        System.out.println(name + " is done!");
    }
}
