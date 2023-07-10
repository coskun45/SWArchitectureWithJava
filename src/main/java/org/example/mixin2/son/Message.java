package org.example.mixin2.son;

import org.example.mixin2.ilk.Escalatable;

public class Message implements Escalatable {
    private String t;
    public Message(String t) { this.t = t; }

    public String text() { return t; }

    // counter
    private int n = 0;
    public int howOften() {
        return n++;
    }
}
