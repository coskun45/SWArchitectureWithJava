package org.example.ProfLecture.InheritanceKapitel2.AbstractClass;

public abstract class DBItem {
    String makeInsertSQL() {
        return ( "INSERT INTO " + getTable() + " (" + getFields()) +  ") VALUES ("  + getValues() + ")";
    }

    abstract String getTable();
    abstract String getFields();
    abstract String getValues();
}
