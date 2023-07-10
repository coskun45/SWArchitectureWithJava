package org.example.ProfLecture.MixinsKapitel3Und4.Escalate;

public class Main {
    public static void main(String[] args) {
        Message m = new Message("Hans");

        System.out.println(m.text());      // "Hans"
        System.out.println(m.escalate());  // "HANS"
        byte[] data = m.utf8();

        // default araciligi ile att degil funktionality yi interface e ekliyoruz.
    }
}
