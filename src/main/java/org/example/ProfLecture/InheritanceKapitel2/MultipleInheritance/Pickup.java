package org.example.ProfLecture.InheritanceKapitel2.MultipleInheritance;

import java.util.List;

public class Pickup {
    List cargos;
    void load(Cargo c) {
        cargos.add(c);
    }
    void unload(Cargo c) {
        cargos.remove(c);
    }
}
