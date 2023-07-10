package org.example.FuncProgrammingInJava;


import java.math.BigInteger;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.example.FuncProgrammingInJava.List.empty;
import static org.example.FuncProgrammingInJava.List.list;

public class Main {
    static <T> List<T> filter(List<T> xs, Predicate<T> p){
        if(xs.isEmpty()) return xs;
        else if(p.test(xs.head))return  list(xs.head,filter(xs.tail,p));
        else return filter(xs.tail,p);
    }
    static <A, B> List<B> map(List<A> xs, Function<A, B> f) {
        if (xs.isEmpty()) return empty();
        else return list(f.apply(xs.head), map(xs.tail, f));
    }
    static <A> void forEach(List<A> xs, Consumer<A> c) {
        if (xs.isEmpty()) return;
        else {
            c.accept(xs.head);
            forEach(xs.tail, c);
            // return (added for clarity)
        }
    }
    static int sum(List<Integer> xs) {
        if (xs.isEmpty()) return 0;  // sum of an empty list is zero
        else return xs.head + sum(xs.tail);
    }





    public static void main(String[] args) {

        Integer reduce = Stream.of(1, 3, 3, 7).reduce(0, Integer::sum);

        System.out.println(reduce);
// 14
        Stream.of(1, 3, 3, 7).reduce(BigInteger.ZERO,
                (bi, i) -> bi.add(BigInteger.valueOf(i)),
                (bi1, bi2) -> bi1.add(bi2));  // combine identity with first result
// 14


    }
}
