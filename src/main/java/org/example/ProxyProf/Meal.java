package org.example.ProxyProf;

import java.util.LinkedList;
import java.util.List;

public class Meal {
    String name;
    String category;
    List<String> notes= new LinkedList<>();

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", notes=" + notes +
                '}';
    }
}
