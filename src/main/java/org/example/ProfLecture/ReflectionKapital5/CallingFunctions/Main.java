package org.example.ProfLecture.ReflectionKapital5.CallingFunctions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        WeirdImp weirdo = new WeirdImp();
        for (Method m : weirdo.getClass().getDeclaredMethods()) {
            m.setAccessible(true);
            if (m.getReturnType() == boolean.class  // ...returns boolean?
                    && m.getParameterCount() == 1   // ...has one arg?
                    && m.getParameterTypes()[0] == String.class) {  // which is String?
                System.out.println(WeirdImp.name);
                System.out.println(m.invoke(weirdo, WeirdImp.name));// bu methodu name parametresi ile cagiriyoruz.
            }
        }
    }
}
