package org.example.ProfLecture.MixinsKapitel3Und4.StatefullEscelate;

public interface Stateful {
    <T> T getState(Class clazz, T initial);
    <T> void setState(Class clazz, T state);
}
