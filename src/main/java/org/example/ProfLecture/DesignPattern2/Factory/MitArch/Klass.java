package org.example.ProfLecture.DesignPattern2.Factory.MitArch;

public interface Klass {
    void method();

    static Klass create() {
        return new KlassImpl();  // inside package: visible!
    }

}
