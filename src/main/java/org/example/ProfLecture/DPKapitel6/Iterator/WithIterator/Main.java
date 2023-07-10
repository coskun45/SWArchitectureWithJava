package org.example.ProfLecture.DPKapitel6.Iterator.WithIterator;

public class Main {
    public static void main(String[] args) {
        BasicList<Integer> list = new SimpleList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
