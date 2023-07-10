package org.example.mixin2.son;

public class StatefulMessage
        extends StatefulObject    // manages state
        implements Escalatable {  // uses state
    private String m;

    public StatefulMessage(String m) { this.m = m; }

    public String text() { return m; }
}