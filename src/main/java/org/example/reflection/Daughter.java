package org.example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Daughter {
    public static void main(String... args) throws IllegalAccessException {
        Imp imp = new Imp();
        for (Field f : imp.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            if (Modifier.isPrivate(f.getModifiers())
                    && f.getType() == String.class) {
                f.set(imp, "Pinocchio");  // oops :-) setter i olmamasina ragmen reflection sayesinde isim atadi
            }
        }
        imp.guess("Pinocchio");  // true :-)
        System.out.println(imp.getName());
    }
}
