package org.example.StrategyProf;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(1);

        Collections.sort(list);
        System.out.println(list);// aufsteigend
        Collections.sort(list,(o1,o2) -> o2.compareTo(o1)); // absteigend
        System.out.println(list);


    }
}
