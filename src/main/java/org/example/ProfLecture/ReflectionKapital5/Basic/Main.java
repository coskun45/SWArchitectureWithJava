package org.example.ProfLecture.ReflectionKapital5.Basic;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // at compile time
        Class<String> klass1 = String.class;
       String klass5=new String();

// or at runtime
        Class<? extends String> klass2 = "Hello, World!".getClass();
        Class<?> klass3 = Class.forName("java.lang.String");
        Class<String> klass4 = (Class<String>) new String().getClass();

        System.out.println(klass1.toString());  // java.lang.String
        System.out.println(klass2.toString());  // ditto...
        System.out.println(klass3.toString());
        System.out.println(klass4.toString());
        System.out.println("**************");
        System.out.println(klass5.toString());

        klass1.getName();  // java.lang.String
        klass1.getSimpleName();  // String
    }
}
