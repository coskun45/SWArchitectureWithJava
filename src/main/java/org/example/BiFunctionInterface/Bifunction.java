package org.example.BiFunctionInterface;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Bifunction {
    public static BigDecimal expA(Double[] f, int n) {
        BigDecimal ergebnis = new BigDecimal(1.0);
        for (int i = 0; i < f.length; i++) {
            BigDecimal hilf = new BigDecimal(Math.exp(f[i]));
            ergebnis = ergebnis.multiply(hilf);
            if (i == n)
                break;
        }
        return ergebnis;
    }

    public static BigDecimal funcExpB(Double[] f, int n){
       return Arrays.stream(f)
               .limit(n+1)
               .map(d->{
                   //System.out.println(d);
                   BigDecimal temp=new BigDecimal(Math.exp(d));
                   System.out.println(temp);
                return  temp  ;
               })
               .reduce(new BigDecimal(1.0), (a, i) -> a.multiply(i));
    }
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(2, 3);
        //System.out.println(result);

        Double[] arr=new Double[]{1.0,2.0,5.0,-7.0};


        //System.out.println(expA(arr,4));

        //funcExpB(arr,2);

        int sum=Stream.of(1, 3, 3, 7)
                .reduce(0, Integer::sum);

        int sum2=Stream.of(1,3,3,7)
                        .reduce(0,(a,b)->a+b);

        System.out.println(sum2);
    }



}
