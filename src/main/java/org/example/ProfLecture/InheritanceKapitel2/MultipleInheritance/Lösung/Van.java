package org.example.ProfLecture.InheritanceKapitel2.MultipleInheritance.Lösung;

import java.util.List;

public interface Van {
    List getPersons();

    default void board(Person p) {
        getPersons().add(p);
    }
}