package org.example.ProfLecture.FuncProgramming.FuncInterface;

public class Main {
    public static void main(String[] args) {

        // method1
        Function<Integer,Integer> test= new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer obj) {
                return(int) Math.pow(obj,obj);
            }
        };

        // method2
        Function<Integer, Integer> square2 = (Integer i) -> { return i * i; };

                // method3

        Function<Integer,Integer> test2=(x)->x*x;



    }
}
