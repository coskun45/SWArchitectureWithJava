package org.example.ProfLecture.DesignPattern2.Singleton;

public enum Singleton {
    INSTANCE;

    // specify more attributes, e.g. a counter
    int counter = 0;

    public int nextInt() {
        return counter++;
    }
}
