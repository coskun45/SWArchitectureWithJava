package org.example.ProfLecture;

public class Test {
    public static void main(String[] args) {

        Data d=new Data();
        Thread t=new Thread(()-> {
            System.out.println("bismillah from thread 1");
            for(int i=0;i<10000;i++){
                d.counter++;
            }
            System.out.println("thread 2 fertig:"+d.counter);

        });



        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("bismillah from thread 2");
                for(int i=0;i<10000;i++){
                    d.counter++;
                }
                System.out.println("thread 2 fertig: "+d.counter);

            }
        });
        t.start();
        t2.start();
    }
}
