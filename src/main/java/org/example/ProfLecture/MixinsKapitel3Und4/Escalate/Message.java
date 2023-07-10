package org.example.ProfLecture.MixinsKapitel3Und4.Escalate;

class Message implements Escalatable, Unicodable {
    private String t;
    public Message(String t) { this.t = t; }

    // required by both interfaces
    public String text() {
        return t;
    }

    // that's it, all done!
}
