package org.example.thread.proceedurConsumer;

public class Main {
    public static void main(String[] args) {
        Buffer<Integer> buf=new Buffer<>();
        new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    try {
                        System.out.println("gelesen:"+buf.get());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();
    }
}
