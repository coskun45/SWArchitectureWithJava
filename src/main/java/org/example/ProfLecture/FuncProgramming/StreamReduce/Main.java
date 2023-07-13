package org.example.ProfLecture.FuncProgramming.StreamReduce;

import java.util.List;
import java.util.Optional;


public class Main {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,2,3,4,5);

        numbers.stream().reduce(0,(a, b) -> a + b);

        Integer integer = numbers.stream().reduce(0,(i, sum) -> i + sum);

        System.out.println(integer);


    }
}
