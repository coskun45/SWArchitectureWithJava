package org.example.reflection;

public class Imp {
    private String name = "Rumpelstiltskin";
    boolean guess(String guess) {
        return guess.equals(name);
    }

    public String getName() {
        return name;
    }
}
