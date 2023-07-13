package org.example.ProfLecture.MixinsKapitel3Und4.Bounds;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        A1 a1=new A1();

        Daten<B> d=new Daten<>();
        d.l.add(c);
       // d.l.add(a1); // erwarte B oder untere Typ von B
        //d.l.add(a);
    }

}
