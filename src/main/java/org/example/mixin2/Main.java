package org.example.mixin2;

import org.example.mixin2.son.Message;

public class Main {
    public static void main(String[] args) {
        Message m =new Message("Hey");

        System.out.println(m.escalate());
        System.out.println(m.escalate());
        System.out.println(m.escalate());
        m.escalate();
        m.escalate();

    }
}