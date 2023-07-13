package org.example.ProfLecture.Thread2Asynchronously;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        Executor ex = new SimpleExecutor();
        int a = 4, b = 0;
        Future<Integer> f1 = ex.async(new Callable<Integer>() { //verilen Callable işlemi asenkron
            // bir şekilde yürütmek üzere Executor'a gönderir ve bir Future nesnesi döndürür.
            @Override
            public Integer call() {
                // can use variables from outer scope
                return a / b;
            }
        });

// do other things if you like...

        try {
            System.out.println(f1.get());//Future nesnesinin sonucunu bekler ve alır.
        } catch (Exception e) {
            System.out.println("The thread raised an exception: "
                    + e.getCause());
        }


    }
}
