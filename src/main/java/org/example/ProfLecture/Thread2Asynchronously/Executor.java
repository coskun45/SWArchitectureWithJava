package org.example.ProfLecture.Thread2Asynchronously;

public interface Executor {
    <T> Future<T> async(Callable<T> task);
}
