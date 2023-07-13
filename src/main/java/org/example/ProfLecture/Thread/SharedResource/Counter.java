package org.example.ProfLecture.Thread.SharedResource;

public class Counter {
    private int c = 0;
    int getCount() {
        return c;
    }
   synchronized void increment() {
        c = c + 1;
    }
}
