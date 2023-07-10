package org.example.ProfLecture.MixinsKapitel3Und4.StatefullEscelate;

public class Main {
    public static void main(String[] args) {
        StatefulMessage m1 = new StatefulMessage("Hans");
        StatefulMessage m2 = new StatefulMessage("Dampf");

        System.out.println(m1.escalated());  // HANS
        System.out.println(m1.escalated());  // HANS!
        System.out.println(m1.escalated());  // HANS!!
        System.out.println(m2.escalated());  // DAMPF
        System.out.println(m2.escalated());  // DAMPF!
        System.out.println(m2.escalated());  // DAMPF!!

    }
}
