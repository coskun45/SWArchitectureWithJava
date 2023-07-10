package org.example.iteratorProf.withoutPattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Basiclist<Integer> list=new SimpleList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        SimpleList<Integer> xs=new SimpleList<>();
        xs.addAll((new Integer[]{1,2,3,4,5}));
        for(int i=0;i<xs.size();i++)
            System.out.println(xs.get(i));

        // mit iterator
        System.out.println("mit iterator");
        Iterator<Integer> it =xs.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
