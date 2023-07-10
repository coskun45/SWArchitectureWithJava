package org.example.ProfLecture.MixinsKapitel3Und4.StatefullEscelate;

import java.util.HashMap;

public class StatefulObject implements Stateful{
    private HashMap<Class, Object> states
            = new HashMap<>();

    public final <T> T getState(Class clazz, T initial) {
        // cast necessary, since internally we store Object!
        return (T) states.getOrDefault(clazz, initial);
    }

    public final <T> void setState(Class clazz, T s) {
        states.put(clazz, s);
    }
}
