package org.example.ProfLecture.MixinsKapitel3Und4.StatefullEscelate;

public class StatefulMessage extends StatefulObject implements Escalatable{
    private String m;

    public StatefulMessage(String m) { this.m = m; }

    public String text() { return m; }
}
