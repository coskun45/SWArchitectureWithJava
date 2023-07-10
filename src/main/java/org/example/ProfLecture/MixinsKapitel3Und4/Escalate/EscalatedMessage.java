package org.example.ProfLecture.MixinsKapitel3Und4.Escalate;

public class EscalatedMessage extends Message{
    public EscalatedMessage(String t) { super(t); }
    public String escalated() {
        return text().toUpperCase();  // HEY I'M SHOUTING AT YOU!
    }
}
