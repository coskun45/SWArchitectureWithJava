package org.example.ProfLecture.InheritanceKapitel2.MultipleInheritance;

import java.util.List;

public class Van {
    List passengers;
    void board(Person p) {
        passengers.add(p);
    }
    void unboard(Person p) {
        passengers.remove(p);
    }
}
