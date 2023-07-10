package org.example.ProfLecture.MixinsKapitel3Und4.GenericsInheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Number n;
        Integer i = 5;
        n = i;  // since Integer extends Number

        Number[] na;
        Integer[] ia = {1, 2, 3, 4};
        na = ia;  // ditto

        ArrayList<Number> as;
        ArrayList<Integer> is = new ArrayList<>();
        //as = is;  // compiler error: incompatible types!



        ArrayList rawL;  // raw type
        ArrayList<Integer> intL = new ArrayList<>();
        ArrayList<String> strL = new ArrayList<>();
        rawL = intL;   // ok, since raw type is base (type erasure)
        strL = rawL;  // compiler warning: unchecked assignment; raw to parameterized
        intL.add(1337);
        System.out.println(strL.get(0));  // exception: cannot cast Integer to String
    }
}
