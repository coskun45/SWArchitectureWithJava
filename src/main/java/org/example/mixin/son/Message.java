package org.example.mixin.son;

public class Message implements Escalatable,Unicodable{
    private String t;
    public Message(String t) { this.t = t; }
    @Override
    public String text() {
        return t;
    }
}
