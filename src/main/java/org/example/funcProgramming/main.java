package org.example.funcProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        IntStream myStream= Arrays.stream(array);
        myStream
                .filter((s)->s%2==0)// ciftleri döndürdü
                .limit(3)// dönen ciftlerin ilk 3 elemanini aldi
                .skip(2)// erste 2 elemente atladi
                .map(n->n+1)// her bir eleman üzerinde degisikli yapip geri yazar.tür degisikligide mümkün
                // Terminal bi operasyon oldugu icin bundan sonra tekrar bi operasyon kullanamayz.
                .forEach(s-> System.out.println(s));
                //.forEach(System.out::println);// method reference ile kullanimi

        // flatmap
        //map -> innerhalb in map kann man typ ändern
        //skip




    }
}
