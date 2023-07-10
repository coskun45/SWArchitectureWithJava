package org.example.ProfLecture.ReflectionKapital5.ZugriffPrivateField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Daughter {
    public static void main(String... args) throws IllegalAccessException {
        Imp imp = new Imp();
        String oracle = null;
        for (Field f : imp.getClass().getDeclaredFields()) {  // get all fields
            f.setAccessible(true);  // oops, you said `private`? :-)
            if (Modifier.isPrivate(f.getModifiers())  // looking for `private String`
                    && f.getType() == String.class) {
                oracle = (String) f.get(imp);  // heureka!
                System.out.println(oracle);
            }
        }
        System.out.println(imp.guess(oracle));  // true :-)
    }
}
