package org.example.asynchronously.MitCallable;

public interface Future<T>{
    T get() throws Exception;
}
