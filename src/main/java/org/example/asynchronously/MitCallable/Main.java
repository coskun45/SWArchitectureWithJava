package org.example.asynchronously.MitCallable;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;

        Executor ex=new SimpleExecutor();
        Future<Integer> fut=ex.async(()->a/b);

        try{
            System.out.println("Ergebnis ist: "+fut.get());
        } catch (Exception e) {
            System.out.println("wohlt was schief gegangen: "+e.toString());
        }
    }
}
