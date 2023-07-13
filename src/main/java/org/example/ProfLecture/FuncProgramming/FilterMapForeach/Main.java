package org.example.ProfLecture.FuncProgramming.FilterMapForeach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int counter =0;

        List<String> myList = Arrays.asList("jose saramgo", "stefan zweig", "tess gerritsen", "selami");
        myList
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("T"))
                .forEach(System.out::println);

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        System.out.println("********************");
        IntStream.range(0,5)
                .map(i->i*i)
                .forEach(System.out::println);
    }
}
