package org.example.ProfLecture.Thread2Asynchronously;

import java.util.concurrent.ExecutionException;

public class SimpleExecutor implements Executor{
    @Override
    public <T> Future<T> async(Callable<T> task) {
        // create anonymous Future instance
        return new Future<T> () {
            Thread t;  // handle on the thread (get needs to wait!)
            T result;  // save the result
            ExecutionException e;  // in case something goes wrong?

            // constructor block
            {
                // create a new thread and start it
                // the runnable "watches" over the task
                t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            result = task.call();
                        } catch (Exception ex) {
                            e = new ExecutionException(ex);
                        }
                    }
                });

                t.start();
            }

            @Override
            public T get() throws InterruptedException, ExecutionException {
                // wait for it...
                t.join();

                // anything fishy?
                if (e != null)
                    throw e;

                // all good, return result!
                return result;
            }
        };
    }
}
