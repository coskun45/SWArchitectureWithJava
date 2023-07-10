package org.example.asynchronously.MitCallable;

public interface Executor {
    <T> Future<T> async(Callable<T> task);
}
