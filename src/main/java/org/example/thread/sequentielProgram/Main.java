package org.example.thread.sequentielProgram;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BeanCounter b1 = new BeanCounter("Bureaucrat 1", 10000);
        BeanCounter b2 = new BeanCounter("Bureaucrat 2", 1000);

        b1.run();
        b2.run();

        System.out.println("main() done!");
    }
}
class BeanCounter {
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
