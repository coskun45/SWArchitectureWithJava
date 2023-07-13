package org.example.ProfLecture.FuncProgramming.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //schreiben sie einen funktionalen Ausdruck,welcher die Quadrate der ersten 3 ungeraden zahlen auf System.out ausgibt
        System.out.println("bismillah");
        int[] arr={5,4,2,4,1,3,6,9,10,11};

        Arrays.stream(arr)
                .filter(s->s%2==1)
                .limit(3)
                .forEach(System.out::println);
    }
}
