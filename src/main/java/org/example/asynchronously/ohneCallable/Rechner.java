package org.example.asynchronously.ohneCallable;

public class Rechner implements Runnable {
    int a,b;
    Integer  c;
    Thread t;
    Exception error;
    public Rechner(int a, int b){
        this.a=a;
        this.b=b;
        t=new Thread(this);
        t.start();;

    }

    @Override
    public void run() {
        System.out.println("uh das ist anstrengend!");


        try {
            c=a/b;
            Thread.sleep(3000);
        } catch (Exception e) {
            this.error=e;
            System.out.println("uh oh");
        }
        System.out.println("fertig");
    }

    public int getC() throws Exception {
        if(error !=null)
            throw error;
        return c;
    }
}
