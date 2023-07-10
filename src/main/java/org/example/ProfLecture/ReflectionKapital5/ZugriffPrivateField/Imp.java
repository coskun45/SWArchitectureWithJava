package org.example.ProfLecture.ReflectionKapital5.ZugriffPrivateField;

public class Imp {
    private String name = "Rumpelstiltskin";
    boolean guess(String guess) {
        return guess.equals(name);
    }
}
