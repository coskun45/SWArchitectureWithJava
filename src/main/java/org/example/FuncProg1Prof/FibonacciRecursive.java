package org.example.FuncProg1Prof;

public class FibonacciRecursive {
   static long fib(int i){
        if(i<2)return 1;
        else{
            return fib(i-1)+fib(i-2);
        }
    }

  static   long SingleUnnestedFib(long a, long b, int i) {
        if (i == 0) return a;
        else if (i == 1) return b;
        else return SingleUnnestedFib(b, a+b, i-1);
    }
    public static void main(String[] args) {


        //System.out.println(fib(4));

        System.out.println(SingleUnnestedFib(1,1,4));

    }


}
