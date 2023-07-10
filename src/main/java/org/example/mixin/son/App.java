package org.example.mixin.son;

public class App {
    public static void main(String[] args) {
        Message m = new Message("Hans");

        System.out.println(m.text());      // "Hans"
        System.out.println(m.escalate());  // "HANS"
        byte[] data = m.utf8();
        System.out.println(data);
    }
}
