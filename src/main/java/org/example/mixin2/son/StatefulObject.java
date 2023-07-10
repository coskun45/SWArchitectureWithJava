package org.example.mixin2.son;

import java.util.HashMap;

public class StatefulObject implements Stateful{
    // note: we store the state for each mixin as Object!
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
