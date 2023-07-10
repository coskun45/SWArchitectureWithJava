package org.example.FuncProgrammingInJava;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
       List<Integer> list =Stream.of(1,4,5,6).filter(n->n<5).collect(Collectors.toList());
    }


}
