package org.example.ProfLecture.FuncProgramming.Immutability;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Collections.list;
import static org.example.ProfLecture.FuncProgramming.Immutability.List.empty;

public class Main {
    public static void main(String[] args) {
       List<Integer> sequence=List.list(1,2,3,4,5);
       List<Integer> emptyList=empty();
       List<Integer> prepend=List.list(0,empty());

        System.out.println(sequence.isEmpty());   // "false"
        System.out.println(emptyList.isEmpty());  // "true"
        System.out.println(prepend.isEmpty());    // "false"


    }
}
