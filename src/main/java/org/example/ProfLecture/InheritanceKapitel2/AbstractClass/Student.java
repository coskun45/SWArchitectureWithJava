package org.example.ProfLecture.InheritanceKapitel2.AbstractClass;

public class Student extends DBItem {
    private String name;
    private int matrikel;
    String getTable() {
        return "student";
    }
    String getFields() {
        return "name, matrikel";
    }
    String getValues() {
        return name + ", " + matrikel;
    }
}
