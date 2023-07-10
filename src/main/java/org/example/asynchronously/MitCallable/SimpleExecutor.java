package org.example.asynchronously.MitCallable;

public class SimpleExecutor implements Executor{
    @Override
    public <T> Future<T> async(Callable<T> task) {
        return new Future<T>() {
            Thread t;// thread anlegen
            T res;
            Exception err;
            // anonymous constr
            {
                t=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            res=task.call();

                        }catch (Exception e){
                            err=e;
                        }
                    }
                });
                t.start();
            }
            @Override
            public T get() throws Exception {
                t.join();
                if(err !=null)
                    throw err;
                return res;
            }
        };
    }
}
