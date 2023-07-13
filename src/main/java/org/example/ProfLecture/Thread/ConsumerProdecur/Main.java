package org.example.ProfLecture.Thread.ConsumerProdecur;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Buffer<Integer> buffer=new Buffer<>();

        Thread t= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<15;i++){
                    try {
                        buffer.put(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<15;i++){
                    try {
                        buffer.get();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        t.start();
        t2.start();
    }
}
