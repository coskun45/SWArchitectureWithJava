package org.example.ProfLecture.InheritanceKapitel2.MultipleInheritance.Lösung;

import java.util.List;

public interface Pickup {
    List getCargos();
    default void board(Cargo p) {
        getCargos().add(p);
    }
}
